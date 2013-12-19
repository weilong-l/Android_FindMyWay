package com.example.findmyway.controller;

import java.util.ArrayList;
import java.util.Collections;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.findmyway.R;
import com.example.findmyway.model.DBHelper;
import com.example.findmyway.model.Search;
import com.example.findmyway.model.SearchResult;
import com.example.findmyway.model.Zone;


public class MainActivity extends Activity {  

	DBHelper db = new DBHelper(this);
	private SQLiteDatabase database;
	//private TextView resultShow;
	private ListView listView;
	private EditText filterEditor;
	//private Button searchButton;
	private ArrayAdapter<String> dataAdapter;
	private SearchResult searchResult;

	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//View finder
		listView = (ListView) findViewById(R.id.list);
		filterEditor = (EditText)findViewById(R.id.editFilter);
		

		//listView.setClickable(true);
		database = db.getReadableDatabase();
		
		setListView();
		
		
/*		searchButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(dataAdapter.getCount()==1){
					SearchLocation(0);				 
				}

				System.out.println("Cant find");
			}
		});*/

		filterEditor.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				/*if ( filterEditor.getText().toString().isEmpty() )  //set visibility of listView
					listView.setVisibility(View.INVISIBLE);
				else
					listView.setVisibility(View.VISIBLE);*/
				
				updateText();
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				updateText();
			}

			@Override
			public void afterTextChanged(Editable s) {
				updateText();
			}
		});

		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {	
				searchResult = new SearchResult();
				SearchLocation(position);
				Intent intent = new Intent(getApplicationContext(), SectorMapDisplay.class);
				intent.putExtra("searchResult", searchResult);
				startActivity(intent);
			}
		});

	}
	private void setListView(){
		String allRoomName = "SELECT * FROM rooms";
		Cursor cr= database.rawQuery(allRoomName,null);
		int crSize= cr.getCount();
		// This array list will be updated each time.
		ArrayList<String> data = new ArrayList<String>();
		for (int i = 0; i<crSize; i++){
			cr.moveToNext();
			String name;
			if(cr.getString(1).isEmpty())
				name=cr.getString(0);
			else
			    name = cr.getString(0).toString()+"; "+cr.getString(1).toString();
			data.add(name);
		}
		Collections.sort(data);
		dataAdapter = new ArrayAdapter<String>(this,
				R.layout.activity_cell, R.id.itemName, data);

		listView.setAdapter(dataAdapter);
	}

	private void updateText() {
		// Update the filter according to the contents of the field.
		String update;
		Search search=new Search(filterEditor.getText().toString());	
		String[] info=search.FindInformation();
		if(info[0]!=null&&info[1]!=null){
			update=info[0]+"-"+info[1];
		}
		else if(info[2]!=null){
			update=info[2];
		}
		else
			update=filterEditor.getText().toString();
		dataAdapter.getFilter().filter(update);
	}

	public void SearchLocation(int position){
		Object o = listView.getItemAtPosition(position);
		String text = o.toString();
		//String searchTerm = text.split(" ")[0] + " " + text.split(" ")[1];
		String searchTerm=text.split(";")[0];
		
		Cursor cres = this.database.rawQuery("SELECT * FROM rooms " +
				"WHERE roomName LIKE '%"+searchTerm+"%';", null);
		//-fetch record
		if(cres.getCount()!=0){
			cres.moveToFirst();//go to first row
			int numCol = cres.getColumnCount();
			//searchResult = new SearchResult();
			for (int i=0; i < numCol; i++){
				switch (i) {
				case 0:
					searchResult.setRoomName(cres.getString(i));
					break;
				case 2:
					searchResult.setLevel(Integer.parseInt(cres.getString(i)));
					break;
				case 4:
					if (Integer.parseInt(cres.getString(i)) == 1) {
						searchResult.setZone(Zone.EAST);
					} else if (Integer.parseInt(cres.getString(i)) == 2) {
						searchResult.setZone(Zone.WEST);
					} else {
						searchResult.setZone(Zone.SOUTH);
					}
					break;
				case 5:
					searchResult.setSector(Integer.parseInt(cres.getString(i)));
					break;
				case 6:
					searchResult.setX(Double.parseDouble(cres.getString(i)));
					break;
				case 7:
					searchResult.setY(Double.parseDouble(cres.getString(i)));
					break;
				default:
					break;
				}
			}
		}
		else{
			System.out.println("Cant find");
		}
	}
}