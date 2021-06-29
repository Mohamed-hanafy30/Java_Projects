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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CityDAOIMPL cityObject  = new CityDAOIMPL();
        CountryDAOIMPL countryObject = new CountryDAOIMPL();
        String cityPath = "C:\\Users\\Kimo Store\\Downloads\\Data_sets\\Cities.csv";
        String countryPath ="C:\\Users\\Kimo Store\\Downloads\\Data_sets\\Countries.csv";
        List<City> cityList = cityObject.readCitiesFromCSV(cityPath);
        List<Country> countryList = countryObject.readCountriesFromCSV(countryPath);
        Map<String,Double> popForCountry = countryObject.getCountryPop(countryList);
        List <Double> countriesPop = countryObject.countryPopulationlist(countryList);
        popForCountry.forEach((k, v) -> System.out.println("Country is: "+ k+ ", Population is: "+ v));
        double averagePopulation = countryObject.avgPopulation(countriesPop);
        System.out.println("The average population for all countries is: "+ averagePopulation);
        double maxPopulation = countryObject.maxPopulation(countriesPop);
        System.out.println("The maximum population for all countries is: "+ maxPopulation);
    }
    
}
