public class Constructor {
    
    public static void main(String[] args) {
        
        /*
        here the obj1 and obj2 are reference variable and not object.
        objects are actually created by "new example()" statement where a new memory is allocated in heap memory.
        */

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

    /**
 * Here you can see, we are defining the example function again with differemt set of parameters
 * this is called Constructor
 */

    public example(int num, float decimal){
        i = 501;
        f = 500.05f;
        System.out.println("Inside overloaded constructor");
    }
}