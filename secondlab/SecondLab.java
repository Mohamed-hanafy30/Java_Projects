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

import java.util.List;
import java.util.Map;

public class SecondLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // CountryDAOIMPL cityObject  = new CountryDAOIMPL();
        CountryDAOIMPL countryObject = new CountryDAOIMPL();
        
        String cityPath = "./src/secondlab/Cities.csv";
        String countryPath ="./src/secondlab/Countries.csv";
        
        
        List<City> cityList = countryObject.readCitiesFromCSV(cityPath);
        List<Country> countryList = countryObject.readCountriesFromCSV(countryPath);
//        Map<String,Double> popForCountry = countryObject.getCountryPop(countryList);
//        List <Double> countriesPop = countryObject.countryPopulationlist(countryList);
//        popForCountry.forEach((k, v) -> System.out.println("Country is: "+ k+ ", Population is: "+ v));
//        double averagePopulation = countryObject.avgPopulation(countriesPop);
//        System.out.println("The average population for all countries is: "+ averagePopulation);
//        double maxPopulation = countryObject.maxPopulation(countriesPop);
//        System.out.println("The maximum population for all countries is: "+ maxPopulation);
        Map<String,List<City>> cities ;
        List<City> sorted ;
        cities = countryObject.codeCityMap();
        //System.out.println(cities.keySet());
        sorted = countryObject.getSortedCities("NZL");
        //System.out.println(sorted);
        Map<String,City> sortedCity = countryObject.highestPopPerCity();
        System.out.println(sortedCity);
        
        City c = countryObject.getHighestPopulationCapital();
        
        System.out.println(c);
        
        
        
    }
    
}
