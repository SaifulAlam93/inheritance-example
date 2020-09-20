package inheritancepractice.IsA_Relationship;

public class FirstClass extends Employee {

   String admin;

    @Override
    public void role() {
        super.role();   // Super indicates the parent class
        System.out.println("Admin controls everything");
    }

}
