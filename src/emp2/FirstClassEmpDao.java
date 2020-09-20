/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp2;

import emp.*;

/**
 *
 * @author bilt
 */
public class FirstClassEmpDao implements EmpDao {

    @Override
    public void addEmp() {
        System.out.println("emp added");
    }

    @Override
    public void editEmp() {
        System.out.println("emp edited");
    }

    @Override
    public void delteEmp() {
        System.out.println("emp deleted");
    }

    @Override
    public void listEmp() {
        System.out.println("emp listed");
    }
    
    
    
}
