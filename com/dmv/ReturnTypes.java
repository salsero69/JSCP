package com.dmv;

public class ReturnTypes {

    public static void main(String[] args)
    {
        ReturnTypes rt = new ReturnTypes();
        
        rt.getAnimal1().doStuff();
        rt.getAnimal2().doStuff();
        rt.getAnimal3().doStuff();
    }
    
    public Animal getAnimal1()
    {
        return new Animal();
    }

    public Animal getAnimal2()
    {
        return new Dog();
    }    
    
    public Dog getAnimal3()
    {
        return (Dog) new Animal();
    }    
    
    class Animal 
    {
        public void doStuff()
        {
            System.out.println("Animal");
        }
    }
    
    class Dog extends Animal
    {
        public void doStuff()
        {
            System.out.println("Dog");
        }
    }
    
}
