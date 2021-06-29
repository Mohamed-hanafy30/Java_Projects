/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betterstring;

/**
 *
 * @author Kimo Store
 */
public class BetterString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                String string1 = "hi";
		String string2 = "hello";
		String longer = StringUtils.betterString(string1, string2, (s1,s2)->s1.length()>s2.length());
		String first = StringUtils.betterString(string1, string2, (s1,s2) -> true);
		System.out.println(longer);
		System.out.println(first);
    }
    
}
