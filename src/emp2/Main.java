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
public class Main {

    public static void main(String[] args) {

        EmpMgt empMgt = new EmpMgt(new SecondClassEmpDao());
        
        empMgt.startEmpManage();

    }

}
