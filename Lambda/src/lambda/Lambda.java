/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import StringUtils;
import java.util.function.BiPredicate;

/**
 *
 * @author Kimo Store
 */
public class Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String longer = StringUtils.betterString("Mohamed", "Mohamed abdelrazik", (s1,s2) -> s1.length() >s2.length());
     System.out.println(longer);
    }
