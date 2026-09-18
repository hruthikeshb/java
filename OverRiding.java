
class Animal
{
    public int getAge(int age) {return age;}

    public Animal giveBirth() {return new Animal();}

}

class Dog extends Animal
{
    
    // private int getAge(int age) {return age;} You cannot change the access modifier of an overridden method. 
    // public long getAge(int age) {return age;} The return type should be the same or covariant. 
    // public int getAge(String age) {return Integer.parseInt(age);} // This is method overloading, not overriding. 
    @Override
    // Valid overriding method. 
    public int getAge(int age) {return age;}

    @Override
    public Dog giveBirth() {return new Dog();} // Covariant return type.


}



public class OverRiding 
{
    public static void main(String[] args)
    {

    }
}
