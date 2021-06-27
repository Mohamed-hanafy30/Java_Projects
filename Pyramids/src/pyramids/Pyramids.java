/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

/**
 *
 * @author Kimo Store
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pyramids.Pyramid;
import pyramids.PyramidComparator;
import pyramids.PyramidsCSVDAOImpl;
public class Pyramids {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PyramidsCSVDAOImpl obj = new PyramidsCSVDAOImpl();
		
		String path = "C:\\Users\\Kimo Store\\Downloads\\pyramids.csv";
		List<Pyramid> l = obj.readPyramidsFromCSV(path);
		for(Pyramid p: l) {
			System.out.println(p);
		}
		List<Pyramid> sortedPyramids = obj.sortPyramids(l);
		for(Pyramid p: sortedPyramids) {
			System.out.println(p);
		}
		Map<String, Integer> countPerLocation = obj.getSiteCount(l);
		countPerLocation.forEach((k, v) -> System.out.println("LOCATION: "+ k+ ", Count "+ v));

	}
    }
    

