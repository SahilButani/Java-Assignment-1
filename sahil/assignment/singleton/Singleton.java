package sahil.assignment.singleton;

public class Singleton {
    String s1;

    /*static Singleton createObject(String str)
    {
        s1=str;	//doesn't allow non static variables inside a static method, gives error.
        return new Singleton();
    }
    */
    void printString()
    {
        System.out.print(s1); // prints default value of string-null.
    }
}
