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

   import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;
import tech.tablesaw.api.Row;
import tech.tablesaw.api.Table;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Analysis {
    public static void main(String args[]) throws IOException
    {
        List<Passenger> passengersDataset = new ReadData().readPassengersJsonFile();

        GraphUtils.graphPassengerAges(passengersDataset);
        GraphUtils.graphPassengerClass(passengersDataset);
        GraphUtils.graphPassengerSurvived(passengersDataset);
        GraphUtils.graphPassengerNotSurvivedSex(passengersDataset);
    }

} 

