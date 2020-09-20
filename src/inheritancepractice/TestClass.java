package inheritancepractice;



public class TestClass {

    public static void main(String[] args) {
        Normal info = new Normal();
        Normal.gpa = 20;
        info.gpa = 2.4f; 
        
        System.out.println(Normal.gpa);
        System.out.println(info.gpa);
        info.abastractMethod();
    }
}
