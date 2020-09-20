/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

/**
 *
 * @author bilt
 */
public class SecondClassEmpDao implements EmpDao {

    @Override
    public void addEmp() {
        System.out.println("s emp added");
    }

    @Override
    public void editEmp() {
        System.out.println("s emp edited");
    }

    @Override
    public void delteEmp() {
        System.out.println("s emp deleted");
    }

    @Override
    public void listEmp() {
        System.out.println("s emp listed");
    }
    
    
    
}
