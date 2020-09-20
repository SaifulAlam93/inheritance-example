package inheritancepractice.IsA_Relationship;

public class SecondClass extends Employee{
    
   String manager;
    
    @Override
    public void role (){
        System.out.println("Manager executes commands");
    }
    
}
