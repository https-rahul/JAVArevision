// class knows something and class does something
// class contains two things, variables and methods
class Calc {

    int num1; // knows something
    int num2;
    int result;

    public void perform() { // does something
        result = num1 + num2;
    }
}

public class Object {

    public static void main(String[] args) {

        /*  
            objects are created to access the variables and methods of another class
            "new" keyword is responsible to allocate memory to the process
        */

        Calc obj = new Calc(); // knows something does something

        //  object is now used to access vars and methods outside their class
        obj.num1 = 3;
        obj.num2 = 5;


        // calling the function to execute the method
        obj.perform();

        System.out.println(obj.result);
    }
}