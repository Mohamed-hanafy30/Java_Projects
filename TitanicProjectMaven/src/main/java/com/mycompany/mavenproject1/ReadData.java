/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Kimo Store
 */
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
public class ReadData {
    public List<Passenger> readPassengersJsonFile() throws IOException
    {
        List<Passenger> passengerList = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try (InputStream input = new FileInputStream("data\\titanic_csv.json"))
        {
            passengerList = objectMapper.readValue(input, new TypeReference<List<Passenger>>() {});
        }
        catch (FileNotFoundException exep) {
            exep.printStackTrace();
        }
        return passengerList;
    }
}
