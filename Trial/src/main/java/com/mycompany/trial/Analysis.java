/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trial;

import java.io.IOException;

/**
 *
 * @author Kimo Store
 */
public class Analysis {
     public static void main( String[] args ) throws IOException
    {

    	HelperFunctions titanicEDA = new HelperFunctions ("C:\\Users\\Kimo Store\\Downloads\\Data_to_use\\titanic.csv");
    	
    	//titanicEDA.getPassenger();
    	titanicEDA.graphPassengerClass();
        titanicEDA.graphPassengersurvived();
        titanicEDA.graphPassengersurvivedGender();
        titanicEDA.graphPassengerAges();
    }
}
