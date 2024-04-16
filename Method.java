
class Calculator {

    // these methods of classes define what they can do
    public int add(int n1, int n2){
        return n1+ n2;
    }

    // method overloading, same method name but different parameters.
    public String add(int n1, int n2, int n3){
        int sum = n1+n2+n3;
        return "Method overloading: " +sum;
    }

}

public class Method {
    
    public static void main(String args[]) {

        // object has to be created while accessing behaviour of other classes
        Calculator obj = new Calculator();

        System.out.println(obj.add(3, 2));
        System.out.println(obj.add(3, 2, 4));
    }
}