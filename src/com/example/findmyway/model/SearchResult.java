package com.example.findmyway.model;

import java.io.Serializable;

public class SearchResult implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Zone zone;
	private int level;
	private int sector;
	private double x;
	private double y;

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSector() {
		return sector;
	}

	public void setSector(int sector) {
		this.sector = sector;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public SearchResult() {
		zone = Zone.EAST;
		level = 0;
		sector = 0;
		x = 0;
		y = 0;
	}
	
	public String toString() {
		return zone.name() + " " + level + " " + sector + " " + x + " " + y + " ";
	}

}
