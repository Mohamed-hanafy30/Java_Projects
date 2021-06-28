/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondlab;

/**
 *
 * @author Kimo Store
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class CityDAOIMPL implements CityDAO{
    
    
    
    
	public List<City> readCitiesFromCSV(String filename) {
		List<City> cities = new LinkedList<City>();
		String[] splitted;
		File f = new File(filename);
		//System.out.println("file exists: "+f.exists());
		if(f.exists()) {
			try {
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String line;
				line = br.readLine();	// reads the first line of data
				while(line != null) {
					splitted = line.split(",");
					cities.add(createCity(splitted));
					line = br.readLine();
				}
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}else {
			System.out.println("file not found!");
		}
		return cities;
	}
    
  	
	public City createCity(String[] metadata) {
		int id = Integer.parseInt(metadata[0]);
		String name = metadata[1];
		String countryCode = metadata[3];
		int population = Integer.parseInt(metadata[2]);
		return new City(id ,name, population ,countryCode);
	}  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
