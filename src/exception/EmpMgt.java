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
public class EmpMgt {
    public static void main(String[] args)  {
        
        Scanner s=new Scanner(System.in);
        
        while(true){
         
        FirstClassEmpDao empDao = new FirstClassEmpDao();
        
            try {
                   empDao.addEmp(s);
            } catch (AgeRestrictionException e) {
                System.out.println(e.getMessage());
                
            }
               
        
//        empDao.editEmp();
//        empDao.delteEmp();
//        empDao.listEmp(); 
        
        }
    }

}
