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

import java.util.Comparator;

public class PyramidComparator implements Comparator<Pyramid>{

	@Override
	public int compare(Pyramid p1, Pyramid p2) {
		if(p1.getHeight() < p2.getHeight()) {
			return 1;
		}else {
			return -1;
		}
	}

}
