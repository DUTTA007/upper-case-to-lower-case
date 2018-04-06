/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lower;

import java.util.Scanner;

/**
 *
 * @author TD
 */
public class Lower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String a,result;
        System.out.print("Enter the words");
        a=scan.nextLine();
        result=a.toLowerCase();
        System.out.println(result);
    }
    
}
