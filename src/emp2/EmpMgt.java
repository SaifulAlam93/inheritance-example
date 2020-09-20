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
public class EmpMgt {
    
   public  EmpMgt(EmpDao empDao){
   
   this.empDao=empDao;
   }
    
    
     EmpDao empDao=null;
    
    public  void startEmpManage() {
        
       
  
        empDao.addEmp();
        empDao.editEmp();
        empDao.delteEmp();
        empDao.listEmp();
      
    }
  
}