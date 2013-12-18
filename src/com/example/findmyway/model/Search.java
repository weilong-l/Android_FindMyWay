package com.example.findmyway.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {
	
	//class properties 
	private String input=null;
	private String LevelNumber=null;
	private String RoomNumber=null;
	private String ProfessorName=null;
	
	//constant regular expressions
	private static final String LR="([0-9]\\s*-\\s*[0-9][0-9]?)\\s*";
	private static final String LEVEL="(l(evel)?\\s*[0-9])\\s*";
	private static final String ROOM="(ro{0,2}m?\\s*[0-9][0-9]?\\s*)";
	private static final String PROFNAME="(((prof)|(professor)|(leturer)|(dr))?"+"\\s*[a-z]+\\s*)";
	private static final String INPUTREGEX=LR+"|"+LEVEL+"|"+ROOM+"|"+PROFNAME;
	
	/**
	 * Search: constructor
	 * @param input: user input in the search box      
	 */	
	public Search(String input){
		this.input=input.toLowerCase();
	}
	
	/**
	 *find out useful information from user's input
	 *@return a string array contains information about level#, room#, or Prof's name     
	 */
	public String[] FindInformation(){
		Pattern tokenPatterns = Pattern.compile(INPUTREGEX);
   	    Matcher matcher = tokenPatterns.matcher(this.input);
   	    
	   	while (matcher.find()){
			 if (matcher.group(1) != null) {
	            String[] getNumber=matcher.group(1).split("-");
	            LevelNumber=getNumber[0].trim();
	            RoomNumber=getNumber[1].trim();
	            continue;
	         }
			 if(matcher.group(2) != null){
				LevelNumber=matcher.group(2).replaceAll("([a-z])|(\\s*)", "");
	            continue;
			 }
			 if(matcher.group(4) != null){
				RoomNumber=matcher.group(4).replaceAll("([a-z])|(\\s*)", "");
	            continue;
			 }
			 if(matcher.group(5) != null){
			    ProfessorName=matcher.group(5).replaceAll("((professor)|(prof)|(lecturer)|(dr))"+"\\s*", "");
	            continue;
			 }
	   	}
	   	
	   	String[] Info={LevelNumber,RoomNumber,ProfessorName};	
	   	return Info;
	}
	
	/*public static void main(String[] args){
		String s="rm   33";
		Search a=new Search(s);
		String[] result=a.FindInformation();
		for(String x:result)
			System.out.println(x);
	}*/
}
