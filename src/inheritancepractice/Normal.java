package inheritancepractice;

public class Normal extends Abstract{
//    This class is accessible and can be inherited by other classes.

    static float gpa;
    
    @Override
    public void abastractMethod(){
        System.out.println("Abstract method inherited");
    }

}
