
package inheritanceexample;
public class Employee {

    public String employeeId;
    public String name;
    public String address;
    public double salary;

    @Override
    public String toString() {
        return String.format("%s;%s;%s;%.2f;", employeeId,name,address,salary);
    }

  
}
