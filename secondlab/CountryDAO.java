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

public interface CountryDAO {
    public List<Country> readCountriesFromCSV(String filename);    
    public Country createCountry(String[] metadata);
    public List <Double> countryPopulationlist(List<Country> list);
    public double avgPopulation(List<Double> list);
    public double maxPopulation(List<Double> list);
    public Map<String, Double> getCountryPop(List<Country> list);
    public City getHighestPopulationCapital();
    public List<City> readCitiesFromCSV(String filename);
    public City createCity(String[] metadata);
    public Map<String,List<City>> codeCityMap();
    public Map<String,City> highestPopPerCity();
    public List<City> getSortedCities(String code);
}
