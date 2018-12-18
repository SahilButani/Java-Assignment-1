package sahil.assignment.data;

public class Data {
    int a;
    char c;

    void printVariables()
    {
        //this statements prints default values of int and char since both are instance variables.
        System.out.print(a);
        System.out.print(c);
    }

	/*void printAgain()
	{
		int a1;
		char c1;
		//this statements gives error as a1 and c1 are not initialized since both variables are local.
		System.out.print(a1);
		System.out.print(c1);
	}*/
}
