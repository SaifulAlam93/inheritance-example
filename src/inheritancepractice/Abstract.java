package inheritancepractice;

abstract class Abstract {
//The class cannot be used to create objects.
//To access an abstract class, it must be inherited from another class.

    int age;
    transient int income;

    /*
     
     */
    public abstract void abastractMethod();
//    Abstract modifier can only be used in an abstract class, and can only be used on methods. 
//    The method does not have a body, for example abstract void run();. 
//    The body is provided by the subclass (inherited from).

    public void abstractCheck() {
        System.out.println("Abstract method activated");
    }

}
