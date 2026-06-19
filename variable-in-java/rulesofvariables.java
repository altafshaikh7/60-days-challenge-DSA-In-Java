
public class rulesofvariables {
    public static void main(String[] args) {
       
        // rules number 1 
        // start with a letter, underscore or dollar sign
        int a = 10; // valid variable name
        int b1 = 20; // valid variable name
        int _c = 30; // valid variable name
        int $d = 40; // valid variable name
        // int 1e = 50; // invalid variable name (starts with a digit)

        // rules number 2
        // special characters are not allowed except for underscore and dollar sign
        // int e@ = 60; // invalid variable name (contains special character '@')
        // int f# = 70; // invalid variable name (contains special character '#')
        // rules number 3
        // variable names are case-sensitive
        int myVariable = 80; // valid variable name
        int MyVariable = 90; // valid variable name (different from 'myVariable'

        // rules number 4
        // variable names cannot be a reserved keyword
        // int class = 100; // invalid variable name (reserved keyword 'class')
        



    }
}