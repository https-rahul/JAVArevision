public class Constructor {
    
    public static void main(String[] args) {
        
        example obj1 = new example();

        example obj2 = new example(5, 5.5F);

    }
}


/**
 * example
 */
class example {

    int i;
    float f;

    public example(){
        i = 101;
        f = 100.01f;
        System.out.println("Inside default constructor");
    }

    public example(int num, float decimal){
        i = 501;
        f = 500.05f;
        System.out.println("Inside overloaded constructor");
    }
}