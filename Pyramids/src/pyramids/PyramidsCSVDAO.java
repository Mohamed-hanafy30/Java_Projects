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

import java.util.List;
import java.util.Map;

public interface PyramidsCSVDAO {
	public Pyramid createPyramid(String[] metadata);
	public List<Pyramid> readPyramidsFromCSV(String filename);
	public List<Pyramid> sortPyramids(List<Pyramid> list);
	public Map<String, Integer> getSiteCount(List<Pyramid> list);
}

