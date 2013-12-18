package com.example.findmyway.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper  {
	  // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "RoomDB";
    private SQLiteDatabase database;
    
    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION); 
    }
    
    public void onCreate(SQLiteDatabase db) {
    	database = db;
        //here is the database definition
    	database.execSQL("CREATE TABLE rooms " +
        "(roomName TEXT, profName TEXT, level INTEGER, roomNumber INTEGER, zoneNumber INTEGER,sectorNumber INTEGER, x REAL, y REAL);");
    	
    	//insert pre-configured records	
    	insertRoom("Office 2-1", "", 2,1,2,2,440,480);
    	insertRoom("Office 2-2", "Ricky Ang", 2,2,2,2,344,480);
    	insertRoom("Office 2-3", "John Fernandez", 2,3,2,2,256,480);
    	insertRoom("Office 2-4", "Katja Holtta-Otto", 2,4,2,2,164,480);
    	insertRoom("Office 2-5", "Chong Keng Hua", 2,5,2,2,84,480);
    	insertRoom("Office 2-6", "", 2,6,2,3,432,480);
    	insertRoom("Office 2-7", "Colla Massimiliano", 2,7,2,3,344,480);
    	insertRoom("Office 2-8", "Ng See Kiong", 2,8,2,3,168,480);
    	insertRoom("Office 2-9", "Yeo Kang Shua", 2,9,2,3,80,480);
    	insertRoom("Office 2-10", "Stylianos DRITSAS", 2,10,2,4,440,480);
    	insertRoom("Office 2-11", "Erik Wilhelm", 2,11,2,4,348,480);
    	insertRoom("Office 2-12", "Yow Wei Quin", 2,12,2,4,260,480);
    	insertRoom("Office 2-13", "Soh Gim Song", 2,13,2,4,180,480);
    	insertRoom("Office 2-14", "Tan Mei Chee", 2,14,2,4,180,744);
    	insertRoom("Office 2-15", "Wu Ping", 2,15,2,4,260,744);
    	insertRoom("Office 2-16", "Yeung Sai Kit", 2,16,2,4,348,744);
    	insertRoom("Office 2-17", "Mohd Nazry Bin Bahrawi", 2,17,2,4,436,744);
    	insertRoom("Office 2-18", "Zhang Chenyu", 2,18,2,3,80,744);
    	insertRoom("Office 2-19", "Chen Lujie", 2,19,2,3,168,744);
    	insertRoom("Office 2-20", "Poletti Dario", 2,20,2,3,352,744);
    	insertRoom("Office 2-21", "Robert Edward Simpson ", 2,21,2,3,436,744);
    	insertRoom("Meeting Room 2-5", "", 2,5,2,3,256,480);
    	insertRoom("Meeting Room 2-6", "", 2,6,2,3,256,744);
    	insertRoom("Meeting Room 2-7", "", 2,7,2,1,80,480);
    	insertRoom("Office 2-22", "", 2,22,1,3,260,480);
    	insertRoom("Office 2-23", "", 2,23,1,3,340,480);
    	insertRoom("Office 2-24", "Siow Chai Sheng", 2,24,1,3,432,480);
    	insertRoom("Office 2-25", "", 2,25,1,2,104,480);
    	insertRoom("Office 2-26", "", 2,26,1,2,220,480);
    	insertRoom("Office 2-27", "", 2,27,1,2,320,480);
    	insertRoom("Office 2-28", "", 2,28,1,1,44,480);
    	insertRoom("Office 2-29", "Giselia Giam ", 2,29,1,1,144,480);
    	insertRoom("Office 2-30", "Cheryl Lee", 2,30,1,1,240,480);
    	insertRoom("Office 2-31", "Lim Pui Hoon Vernice ", 2,31,1,1,332,480);
    	insertRoom("Office 2-32", "Tang Sweet Kook", 2,32,1,1,420,480);
    	insertRoom("Office 2-33", "Cindy Wang", 2,33,1,1,160,744);
    	insertRoom("Office 2-34", "Joyce Lim", 2,34,1,1,64,744);
    	insertRoom("Office 2-35", "", 2,35,1,2,368,744);
    	insertRoom("Office 3-1", "Jean Yong", 3,1,2,2,160,480);
    	insertRoom("Office 3-2", "Tan U-Xuan", 3,2,2,2,76,480);
    	insertRoom("Office 3-3", "Andres Sevtsuk", 3,3,2,3,440,480);
    	insertRoom("Office 3-4", "Larry Sass", 3,4,2,3,344,480);
    	insertRoom("Office 3-5", "Hyowon Lee", 3,5,2,3,252,480);
    	insertRoom("Office 3-6", "Elica Kyoseva", 3,6,2,3,168,480);
    	insertRoom("Office 3-7", "Samson Lim", 3,7,2,3,80,480);
    	insertRoom("Office 3-8", "Pang Yang Huei", 3,8,2,4,432,480);
    	insertRoom("Office 3-9", "Sarah Norman", 3,9,2,4,340,480);
    	insertRoom("Office 3-10", "Sun Jun", 3,10,2,4,252,480);
    	insertRoom("Office 3-11", "Ricardo Sosa", 3,11,2,4,160,480);
    	insertRoom("Office 3-12", "Yuen Chau", 3,12,2,4,72,480);
    	insertRoom("Office 3-13", "Jason Gu", 3,13,2,5,432,480);
    	insertRoom("Office 3-14", "Dawn Koh Chin-Ing", 3,14,2,5,344,480);
    	insertRoom("Office 3-15", "Casey Hammond", 3,15,2,5,267.6,480);
    	insertRoom("Office 3-16", "Nagi-Man Cheung", 3,16,2,5,344,744);
    	insertRoom("Office 3-17", "Lui Siu Hang Simon", 3,17,2,5,432,744);
    	insertRoom("Office 3-18", "", 3,18,2,4,80,744);
    	insertRoom("Office 3-19", "James Rowlins", 3,19,2,4,160,744);
    	insertRoom("Office 3-20", "Zhu Yajuan", 3,20,2,4,252,744);
    	insertRoom("Office 3-21", "Mohan Rajesh Elara", 3,21,2,4,348,744);
    	insertRoom("Office 3-22", "Dawn Tan ", 3,22,2,4,432,744);
    	insertRoom("Office 3-23", "Kevin Otto", 3,23,2,3,80,744);
    	insertRoom("Office 3-24", "Chen Jia Jia", 3,24,2,3,172,744);
    	insertRoom("Office 3-25", "Stefan Schafer", 3,25,2,1,160,480);
    	insertRoom("Office 3-26", "Lu Wei", 3,26,2,1,240,748);
    	insertRoom("Office 3-27", "Grace Dixon", 3,27,2,1,340,748);
    	insertRoom("Office 3-28", "", 3,28,2,1,440,748);
    	insertRoom("Meeting Room 3-13", "", 3,13,2,1,308,456);
    	insertRoom("Office 3-29", "Gim Yang (Maggie) Pee ", 3,29,1,4,48,744);
    	insertRoom("Office 3-30", "Kwan Wei Lek", 3,30,1,4,140,744);
    	insertRoom("Office 3-31", "Chen Xiaoming", 3,31,1,2,344,744);
    	insertRoom("Office 3-32", "Chandrima Chatterjee", 3,32,1,2,432,744);
    	insertRoom("Office 3-33", "Teo Tee Hui", 3,33,1,1,80,744);
    	insertRoom("Office 3-34", "Zhou Yi", 3,34,1,1,160,744);
    	insertRoom("Office 3-35", "Thomas Schroepfer", 3,35,1,1,432,480);
    	insertRoom("Office 3-36", "Suranga Chandima Nanayakkara", 3,36,1,1,344,480);
    	insertRoom("Office 3-37", "Nilanjan Raghunath", 3,37,1,1,260,480);
    	insertRoom("Office 3-38", "Yang Hui Ying", 3,38,1,1,160,480);
    	insertRoom("Office 3-39", "Foong Shaohui", 3,39,1,1,80,480);
    	insertRoom("Office 3-40", "Cheah Chin Wei", 3,40,1,2,432,480);
    	insertRoom("Office 3-41", "Anariba Franklin Edwin", 3,41,1,2,344,480);
    	insertRoom("Office 3-42", "Lakshminarasimhan Krishnaswamy ", 3,42,1,2,252,480);
    	insertRoom("Office 3-43", "Jeffrey Huang", 3,43,1,2,140,480);
    	insertRoom("Office 3-44", "Kris Wood", 3,44,1,3,320,480);
    	insertRoom("Meeting Room 3-18", "", 3,18,3,1,204,260);
    	insertRoom("Meeting Room 3-16", "", 3,16,1,3,430,480);
    	insertRoom("Office 3-45", "Tan Mei Xuan", 3,45,3,2,40,420);
    	insertRoom("Office 3-46", "Bige Tuncer", 3,46,3,2,348,420);
    	insertRoom("Office 3-47", "", 3,47,3,2,248,420);
    	insertRoom("Office 3-48", "", 3,48,3,2,164,420);
    	insertRoom("Office 3-49", "Koh Mei Hua", 3,49,3,2,72,420);
    	insertRoom("Office 3-50", "WU Chunfeng", 3,50,3,3,252,420);
    	insertRoom("Office 3-51", "Budiman Arief", 3,51,3,3,48,420);
    	insertRoom("Office 3-52", "Rajesh Chandramohanadas", 3,52,3,3,52,584);
    	insertRoom("Office 3-53", "", 3,53,3,3,192,744);
    	insertRoom("Office 3-54", "Roland Bouffanais", 3,54,3,3,280,744);
    	insertRoom("Office 3-55", "Paolo Di Leo", 3,55,3,2,88,744);
    	insertRoom("Office 3-56", "Sawako KAIJIMA", 3,56,3,2,172,744);
    	insertRoom("Office 3-57", "Apple Koh Li Ling", 3,57,3,2,252,744);
    	insertRoom("Office 3-58", "Shubhakar", 3,58,3,2,340,744);
    	insertRoom("Office 3-59", "Yow Wei Quin (experiment)", 3,59,3,2,36,744);
    	insertRoom("Office 3-60", "Zhao Rong", 3,60,3,1,120,744);
    	insertRoom("Office 3-61", "Philip Truscott", 3,61,3,1,208,744);
    	insertRoom("Office 3-62", "Erwin Viray", 3,62,3,1,420,740);
    	insertRoom("Office 3-63", "Joseph Fitzsimons", 3,63,3,1,420,672);
    	insertRoom("Office 3-64", "Low Hong Yee", 3,64,3,1,420,600);
    	insertRoom("Office 3-65", "", 3,65,3,1,404,420);
    	insertRoom("Office 3-66", "Florence Yoo ", 3,66,3,1,280,420);
    	insertRoom("Office 3-67", "Sim Yih Shyang, Andy", 3,67,3,1,192,420);
    	insertRoom("Office 4-1", "Haoliang Qi", 4,1,2,2,160,480);
    	insertRoom("Office 4-2", "Tony Quek", 4,2,2,2,80,480);
    	insertRoom("Office 4-3", "Luo Jianxi", 4,3,2,3,432,480);
    	insertRoom("Office 4-4", "Oka Kurniawan", 4,4,2,3,340,480);
    	insertRoom("Office 4-5", "Marco Scarsini", 4,5,2,3,256,480);
    	insertRoom("Office 4-6", "Eng Ying Bong", 4,6,2,3,160,480);
    	insertRoom("Office 4-7", "Oliver Heckmann", 4,7,2,3,80,480);
    	insertRoom("Office 4-8", "Das Bikramjit", 4,8,2,4,432,480);
    	insertRoom("Office 4-9", "", 4,9,2,4,340,480);
    	insertRoom("Office 4-10", "Zhenxing ZHAO", 4,10,2,4,252,480);
    	insertRoom("Office 4-11", "Subhajit Datta", 4,11,2,4,160,480);
    	insertRoom("Office 4-12", "Andrea Castelletti ", 4,12,2,4,80,480);
    	insertRoom("Office 4-13", "Joel Yang", 4,13,2,5,440,480);
    	insertRoom("Office 4-14", "Anders Yeo", 4,14,2,5,344,480);
    	insertRoom("Office 4-15", "Sergey Kusharev", 4,15,2,5,260,480);
    	insertRoom("Office 4-16", "Yoong Cheah Huei Andrew", 4,16,2,5,344,744);
    	insertRoom("Office 4-17", "", 4,17,2,5,432,744);
    	insertRoom("Office 4-18", "", 4,18,2,4,80,744);
    	insertRoom("Office 4-19", "Gu Feng James WAN", 4,19,2,4,164,744);
    	insertRoom("Office 4-20", "Axel Pavillet", 4,20,2,4,252,744);
    	insertRoom("Office 4-21", "Lee Chee Huei", 4,21,2,4,348,744);
    	insertRoom("Office 4-22", "Loh Kok Keong Peter", 4,22,2,4,432,744);
    	insertRoom("Office 4-23", "Avinash Baji", 4,23,2,3,80,744);
    	insertRoom("Office 4-24", "Bellam Sreenivasulu", 4,24,2,3,168,744);
    	insertRoom("Office 4-25", "Michael Damon Reid", 4,25,2,1,160,744);
    	insertRoom("Office 4-26", "Ye Ai", 4,26,2,1,240,744);
    	insertRoom("Office 4-27", "Marcus ANG Teck Meng", 4,27,2,1,340,744);
    	insertRoom("Office 4-28", "Ong Eng Shi", 4,28,2,1,432,744);
    	insertRoom("Meeting Room 4-1", "", 4,1,2,1,136,468);
    	insertRoom("Meeting Room 4-2", "", 4,2,2,1,304,468);
    	insertRoom("Office 4-29", "Duan Ling Jie", 4,29,1,4,44,744);
    	insertRoom("Office 4-30", "Zhang Yue", 4,30,1,4,132,744);
    	insertRoom("Office 4-31", "Foo Yu Chiann", 4,31,1,2,340,744);
    	insertRoom("Office 4-32", "Giacomo Nannicini", 4,32,1,2,436,744);
    	insertRoom("Office 4-33", "Selin Damla Ahipasaoglu", 4,33,1,1,80,744);
    	insertRoom("Office 4-34", "Padilla Michael", 4,34,1,1,160,744);
    	insertRoom("Office 4-35", "Chen Zaichun Herman", 4,35,1,1,432,480);
    	insertRoom("Office 4-36", "Abu Samah Zuruzi", 4,36,1,1,344,480);
    	insertRoom("Office 4-37", "", 4,37,1,1,256,480);
    	insertRoom("Office 4-38", "Mihye Cho", 4,38,1,1,160,480);
    	insertRoom("Office 4-39", "B. Reginald Thio", 4,39,1,1,80,480);
    	insertRoom("Office 4-40", "Natatajan Karthik", 4,40,1,2,432,480);
    	insertRoom("Office 4-41", "TANERI Niyazi", 4,41,1,2,347.6,480);
    	insertRoom("Office 4-42", "Justin Ruths", 4,42,1,2,260,480);
    	insertRoom("Office 4-43", "Aditya Mathur", 4,43,1,2,140,480);
    	insertRoom("Office 4-44", "Saif Benjaafar", 4,44,1,3,320,480);
    	insertRoom("Meeting Room 4-3", "", 4,3,1,4,184,480);
    	insertRoom("Meeting Room 4-4", "", 4,4,1,4,100,480);
    	insertRoom("Meeting Room 4-5", "", 4,5,1,3,440,480);
    	insertRoom("Meeting Room 4-6", "", 4,6,3,1,204,260);
    	insertRoom("Office 4-45", "Yang Shengyuan", 4,45,3,2,40,420);
    	insertRoom("Office 4-46", "Stefano Galelli", 4,46,3,2,348,420);
    	insertRoom("Office 4-47", "Christian Lowenstein", 4,47,3,2,248,420);
    	insertRoom("Office 4-48", "Manuel Clavel", 4,48,3,2,164,420);
    	insertRoom("Office 4-49", "Quansheng GUAN", 4,49,3,2,72,420);
    	insertRoom("Office 4-50", "Shrutivandana Sharma", 4,50,3,3,252,420);
    	insertRoom("Office 4-51", "", 4,51,3,3,48,420);
    	insertRoom("Office 4-52", "", 4,52,3,3,52,584);
    	insertRoom("Office 4-53", "", 4,53,3,3,192,744);
    	insertRoom("Office 4-54", "Nilanjan Roy", 4,54,3,3,280,744);
    	insertRoom("Office 4-55", "Yunjian XU", 4,55,3,2,88,744);
    	insertRoom("Office 4-56", "Alastair Gornall", 4,56,3,2,172,744);
    	insertRoom("Office 4-57", "David Yau", 4,57,3,2,252,744);
    	insertRoom("Office 4-58", "Ho Seng Tiong ", 4,58,3,2,340,744);
    	insertRoom("Office 4-59", "", 4,59,3,2,36,744);
    	insertRoom("Office 4-60", "Costas Courcoubetis", 4,60,3,1,120,744);
    	insertRoom("Office 4-61", "", 4,61,3,1,208,744);
    	insertRoom("Office 4-62", "", 4,62,3,1,420,740);
    	insertRoom("Office 4-63", "Wei Lu", 4,63,3,1,420,672);
    	insertRoom("Office 4-64", "Min Sheng", 4,64,3,1,420,600);
    	insertRoom("Office 4-65", "", 4,65,3,1,404,420);
    	insertRoom("Office 4-66", "", 4,66,3,1,280,420);
    	insertRoom("Office 4-67", "", 4,67,3,1,192,420);

        
        
   }
    
    public void insertRoom(String roomName, String profName, int level, int roomNumber, int zoneNumber,int sectorNumber, double x, double y){
    	String sql=
    			"INSERT INTO rooms (roomName, profName, level, roomNumber, zoneNumber, sectorNumber, x , y) VALUES('" +
    			roomName+"','"+profName+"','"+level+"','"+roomNumber+"','"+zoneNumber+"','"+sectorNumber+"','"+x+"','"+y+"');";
    	database.execSQL(sql);
    }

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		if (oldVersion >= newVersion) 
			{return;
			}
			
	    db.execSQL("DROP DATABASE IF EXISTS " + DATABASE_NAME +";");
	    onCreate(db);
	} 

}
