/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allcharacters;

/**
 *
 * @author Kimo Store
 */
public class AllCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String alpha= "Hereisstingwithnonumber";
        String alphanum = "butthisonehasnumberwhihcis99";
        System.out.println("Is "+alpha+" alphabetic only? "+StringUtils.OnlyAlphabets(alpha));
        System.out.println("Is "+alphanum+" alphabetic only? "+StringUtils.OnlyAlphabets(alphanum));
    }
    
}
