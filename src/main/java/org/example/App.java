package org.example;

public class App 
{
    public static void main( String[] args )
    {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String checkMethod = passwordGenerator.generatePassword(8);
        System.out.println("Перевірка методу: " + checkMethod);
    }
}
