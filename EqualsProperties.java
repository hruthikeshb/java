

class X
{
    int num;

}


public class EqualsProperties {
    public static void main(String[] args)
    {
        /*
        Reflexive: A object must be equals to itself 
        Mathematically: x.equals(x) should return true 
        */

        X x1 =  new X();

        System.out.println(x1.equals(x1));

        /*
        Symetric: If Object A is equal to Object B the vice versa should also be true 
        Mathematically: if x.equals(y) is true, the y.equals(x) should also be true 
        */
    

    }
    
}
