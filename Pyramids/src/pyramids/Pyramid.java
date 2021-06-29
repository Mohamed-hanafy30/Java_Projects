/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kimo Store
 */
package pyramids;

public class Pyramid {
	private double height;
	private String modernName;
	private String pharaoh;
	private String site;
	
	public Pyramid(double height, String modernName, String pharaoh, String site) {
		super();
		this.height = height;
		this.modernName = modernName;
		this.pharaoh = pharaoh;
		this.site = site;
	}

	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getModernName() {
		return modernName;
	}
	
	public void setModernName(String modernName) {
		this.modernName = modernName;
	}
	
	public String getPharaoh() {
		return pharaoh;
	}
	
	public void setPharaoh(String pharaoh) {
		this.pharaoh = pharaoh;
	}
	
	public String getSite() {
		return site;
	}
	
	public void setSite(String site) {
		this.site = site;
	}
	
	public String toString() {
		String s = "";
		s += "Pyramid Name: " + this.modernName + " ";
		s += "Pharaoh Name: " + this.pharaoh + " ";
		s += "Pyramid Height: " + this.height + " ";
		s += "Site Name: " + this.site + " ";
		
		return s;
	}
}

