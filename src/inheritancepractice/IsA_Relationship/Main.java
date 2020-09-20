package inheritancepractice.IsA_Relationship;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee admin = new FirstClass();   // here FirstClass (admin) is an Employee
        Employee manager = new SecondClass();  // here SecondClass (manager) is an Employee
        Employee labour = new ThirdClass(); // here SecondClass (labour) is an Employee

        employee.role();
        admin.role();   // Overrided method will be called
        manager.role();
        labour.role();

        FirstClass newAdmin = (FirstClass) admin; // Casting the 'admin' object of Employee data type into FirstClass data type.
        // Now we have the attributes and methods of the FirstClass class in the newAdmin object

        newAdmin.role();

    }

}
