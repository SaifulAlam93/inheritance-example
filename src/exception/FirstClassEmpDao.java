/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;

/**
 *
 * @author bilt
 */
public class FirstClassEmpDao {

    public void addEmp(Scanner s) throws AgeRestrictionException {

        int age = s.nextInt();
        System.out.println("age : " + age);
        System.out.println("emp added");

        if (age > 50) {
//            throw new AgeRestrictionException("ager should be >50");
            throw new AgeRestrictionException();
        }

    }

    public void editEmp() {
        System.out.println("emp edited");
    }

    public void delteEmp() {
        System.out.println("emp deleted");
    }

    public void listEmp() {
        System.out.println("emp listed");
    }

}
