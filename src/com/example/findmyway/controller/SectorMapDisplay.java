package com.example.findmyway.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.findmyway.R;
import com.example.findmyway.model.SearchResult;
import com.example.findmyway.model.Zone;

/**
 * The Activity that displays the Sector Map. Contains a search bar for further searches. Able to display the Zone Map overlay to indicate the area of the Zone it is in.
 * 
 * @author En Wei
 *
 */
public class SectorMapDisplay extends Activity {
	//private static boolean zoneDisplay = false;
	private static int zoneMapID = R.drawable.east2_1h;
	private static int sectorMapID = R.drawable.east2_1;
	private static Zone zone = Zone.EAST;
	private static int sector = 1;
	private static int level = 2;
	private static SearchResult searchResult;

/*	public final static String LEVEL = "mapdisplay.findmyway.LEVEL";
    public final static String ZONE = "mapdisplay.findmyway.ZONE";
    public final static String SECTOR = "mapdisplay.findmyway.SECTOR";
    public final static String X = "mapdisplay.findmyway.X";
    public final static String Y = "mapdisplay.findmyway.Y";*/
    
    
	@SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sector_map_display);

		
		searchResult = (SearchResult)getIntent().getSerializableExtra("searchResult");
		level = searchResult.getLevel();
		zone = searchResult.getZone();
		sector = searchResult.getSector();

		getMapID();
		
		ImageView pointer = (ImageView) findViewById(R.id.pointer);
		pointer.setX((float)(searchResult.getX()*0.9524-35));
		pointer.setY((float)(searchResult.getY()*0.9525-80));
		
		ImageView sectorMap = (ImageView) findViewById(R.id.sector_map);
		sectorMap.setBackgroundResource(sectorMapID);
		ImageView zoneMap = (ImageView) findViewById(R.id.zone_map);
		zoneMap.setBackgroundResource(zoneMapID);
		
		Button button = (Button) findViewById(R.id.displayZoneMap);
		button.setBackgroundResource(zoneMapID);
		
		TextView levelTextView = (TextView) findViewById(R.id.levelText);
		levelTextView.setText("Level "+level);
		TextView sectorTextView = (TextView) findViewById(R.id.sectorText);
		sectorTextView.setText(zone.name());
	}

	/**
	 * Overlays the Zone Map indicating the area the Sector it is in when the Map buton is pressed.
	 * 
	 * @param view
	 */
	public void displayZoneMap(View view){/*
		ImageView sectorMap =(ImageView) findViewById(R.id.sector_map);
		if (zoneDisplay){
			sectorMap.setBackgroundResource(sectorMapID);
		}
		else{
			sectorMap.setBackgroundResource(zoneMapID);
		}
		zoneDisplay = !zoneDisplay;*/
		ImageView sectorMap =(ImageView) findViewById(R.id.sector_map);
		ImageView zoneMap =(ImageView) findViewById(R.id.zone_map);
		ImageView pointer =(ImageView) findViewById(R.id.pointer);
		Button button = (Button) findViewById(R.id.displayZoneMap);
		
		if (zoneMap.getVisibility()==View.GONE){
			zoneMap.setVisibility(View.VISIBLE);
			pointer.setVisibility(View.GONE);
			sectorMap.setVisibility(View.GONE);
			button.setBackgroundResource(sectorMapID);
		}
		else{
			zoneMap.setVisibility(View.GONE);
			pointer.setVisibility(View.VISIBLE);
			sectorMap.setVisibility(View.VISIBLE);
			button.setBackgroundResource(zoneMapID);
		}
	}
	
	
	/**
	 * Sets the Zone and Sector Map ID based on the current level, zone and sector.
	 * 
	 */
	private static void getMapID(){
		if (level == 2){
			if (zone == Zone.EAST){
				if (sector == 1){
					sectorMapID = R.drawable.east2_1;
					zoneMapID = R.drawable.east2_1h;
				}
				else if (sector == 2){
					sectorMapID = R.drawable.east2_2;
					zoneMapID = R.drawable.east2_2h;
				}
				else if (sector == 3){
					sectorMapID = R.drawable.east2_3;
					zoneMapID = R.drawable.east2_3h;
				}
				else if (sector == 4){
					sectorMapID = R.drawable.east2_4;
					zoneMapID = R.drawable.east2_4h;
				}
			}
			else if (zone == Zone.WEST){
				if (sector == 1){
					sectorMapID = R.drawable.west2_1;
					zoneMapID = R.drawable.west2_1h;
				}
				else if (sector == 2){
					sectorMapID = R.drawable.west2_2;
					zoneMapID = R.drawable.west2_2h;
				}
				else if (sector == 3){
					sectorMapID = R.drawable.west2_3;
					zoneMapID = R.drawable.west2_3h;
				}
				else if (sector == 4){
					sectorMapID = R.drawable.west2_4;
					zoneMapID = R.drawable.west2_4h;
				}	
			}
		}
		else if (level == 3){
			if (zone == Zone.EAST){
				if (sector == 1){
					sectorMapID = R.drawable.east3_1;
					zoneMapID = R.drawable.east3_1h;
				}
				else if (sector == 2){
					sectorMapID = R.drawable.east3_2;
					zoneMapID = R.drawable.east3_2h;
				}
				else if (sector == 3){
					sectorMapID = R.drawable.east3_3;
					zoneMapID = R.drawable.east3_3h;
				}
				else if (sector == 4){
					sectorMapID = R.drawable.east3_4;
					zoneMapID = R.drawable.east3_4h;
				}
			}
			else if (zone == Zone.WEST){
				if (sector == 1){
					sectorMapID = R.drawable.west3_1;
					zoneMapID = R.drawable.west3_1h;
				}
				else if (sector == 2){
					sectorMapID = R.drawable.west3_2;
					zoneMapID = R.drawable.west3_2h;
				}
				else if (sector == 3){
					sectorMapID = R.drawable.west3_3;
					zoneMapID = R.drawable.west3_3h;
				}
				else if (sector == 4){
					sectorMapID = R.drawable.west3_4;
					zoneMapID = R.drawable.west3_4h;
				}	
				else if (sector == 5){
					sectorMapID = R.drawable.west3_5;
					zoneMapID = R.drawable.west3_5h;
				}				
			}
			else if (zone == Zone.SOUTH){
				if (sector == 1){
					sectorMapID = R.drawable.south3_1;
					zoneMapID = R.drawable.south3_1h;
				}
				else if (sector == 2){
					sectorMapID = R.drawable.south3_2;
					zoneMapID = R.drawable.south3_2h;
				}
				else if (sector == 3){
					sectorMapID = R.drawable.south3_3;
					zoneMapID = R.drawable.south3_3h;
				}
			}
		}
		else if (level == 4){
			if (zone == Zone.EAST){
				if (sector == 1){
					sectorMapID = R.drawable.east4_1;
					zoneMapID = R.drawable.east4_1h;
				}
				else if (sector == 2){
					sectorMapID = R.drawable.east4_2;
					zoneMapID = R.drawable.east4_2h;
				}
				else if (sector == 3){
					sectorMapID = R.drawable.east4_3;
					zoneMapID = R.drawable.east4_3h;
				}
				else if (sector == 4){
					sectorMapID = R.drawable.east4_4;
					zoneMapID = R.drawable.east4_4h;
				}
			}
			else if (zone == Zone.WEST){
				if (sector == 1){
					sectorMapID = R.drawable.west4_1;
					zoneMapID = R.drawable.west4_1h;
				}
				else if (sector == 2){
					sectorMapID = R.drawable.west4_2;
					zoneMapID = R.drawable.west4_2h;
				}
				else if (sector == 3){
					sectorMapID = R.drawable.west4_3;
					zoneMapID = R.drawable.west4_3h;
				}
				else if (sector == 4){
					sectorMapID = R.drawable.west4_4;
					zoneMapID = R.drawable.west4_4h;
				}	
				else if (sector == 5){
					sectorMapID = R.drawable.west4_5;
					zoneMapID = R.drawable.west4_5h;
				}				
			}
			else if (zone == Zone.SOUTH){
				if (sector == 1){
					sectorMapID = R.drawable.south4_1;
					zoneMapID = R.drawable.south4_1h;
				}
				else if (sector == 2){
					sectorMapID = R.drawable.south4_2;
					zoneMapID = R.drawable.south4_2h;
				}
				else if (sector == 3){
					sectorMapID = R.drawable.south4_3;
					zoneMapID = R.drawable.south4_3h;
				}
			}
		}
	}
	
/*	@SuppressLint("NewApi")
	public void searchString(View view){
		x=0.0;
		y=0.0;
		EditText searchBar = (EditText) findViewById(R.id.search_field);
		String searchInput= (searchBar.getText()).toString();
		boolean validSearchInput = true;
		if (searchInput.length() == 11){
			for (int i = 0; i < 11; i++){
				if (searchInput.charAt(i)<48 || searchInput.charAt(i)>57){
					validSearchInput = false;
				}
				else{
					if(i==0){
						level = (searchInput.charAt(i)-48);
					}
					else if(i==1){
						if(searchInput.charAt(i)-48 == 1){
							zone = Zone.EAST;
						}
						else if(searchInput.charAt(i)-48 == 2){
							zone = Zone.WEST;
						}
						else if(searchInput.charAt(i)-48 == 3){
							zone = Zone.SOUTH;
						}
					}
					else if(i==2){
						sector = (searchInput.charAt(i)-48);
					}
					else if(i>=3 && i <=6){
						x += (searchInput.charAt(i)-48)*Math.pow(10, 6-i);
					}
					else if(i>=7 && i <=10){
						y += (searchInput.charAt(i)-48)*Math.pow(10, 10-i);
					}
				}
			}
			if (validSearchInput){
				Intent refresh = new Intent(this, SectorMapDisplay.class);
				refresh.putExtra(LEVEL, level);
				if (zone == Zone.EAST){
					refresh.putExtra(ZONE, 1);
				}
				else if (zone == Zone.WEST){
					refresh.putExtra(ZONE, 2);
				}
				else if (zone == Zone.SOUTH){
					refresh.putExtra(ZONE, 3);
				}
				refresh.putExtra(SECTOR, sector);
				refresh.putExtra(X, x);
				refresh.putExtra(Y, y);
				finish();
				startActivity(refresh);
			}
		}
	}*/
}

