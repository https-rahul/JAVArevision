// class knows something and class does something
// class contains two things, variables and methods
class Calc {

    int num1; // knows something
    int num2;
    int result;

    public void perform() { // does something, behaviour
        result = num1 + num2;
    }
}

public class Object {

    // main is the start of execution.
    public static void main(String[] args) {

        // reference vairable obj of type Calc.
        Calc obj = new Calc(); // knows something does something

        //  object is now used to access vars and methods outside their class
        obj.num1 = 3;
        obj.num2 = 5;


        // calling the function to execute the method
        obj.perform();

        System.out.println(obj.result);
    }
}