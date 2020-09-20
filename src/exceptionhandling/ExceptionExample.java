/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author bilt
 */
public class ExceptionExample {

    public static void main(String[] args) {
      //  Student s = null;
        Scanner ss= new Scanner(System.in);
        try {
            int i = ss.nextInt();
                      
            System.out.println(i);
          //  s.name = "hasan";
        } catch (NullPointerException e) {
            System.out.println(e);
           // System.out.println("exception cought null");
           // e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("exception cought miss");
           // e.printStackTrace();
        }
        
        
        finally {        
            ss.close();
            System.out.println("finnaly");
        
        }
        
        
        

        System.out.println("hello world");
    }
}
