package com.Selenium_Test_Intellij;         //Defining the Package

public class Main {                         //Class

    public static void main(String[] args) {    //Method--Main method is already defined
	// write your code here
        System.out.println("Starting Point of Execution");  //Main is the heart and the starting point for execution without this cant execute
//Always save file with extension .java like .xls,.txt
        //Singe characters goes into 'a','A'etc..Not more than one is not allowed
        //Int
        //Double
        //Boolean-True/False Values and these is also keywords available in Java
        //String is not Datatype,It is a class,We can use as a Datatype
        //Primitive Data types-Integer,char,Boolean,Double
        //String-Is not Primitive datatype,it is a class
        int a = 1;
        int b = 2;
        String c = "First";
        String d = "Second";
        Double e = 10.1;
        Double f = 20.6;
        //String concatination
        System.out.println(a+b);
        System.out.println(a+b+e+f);
        System.out.println(a+b+c+d+e+f);
        System.out.println(c+d+a+b+e+f);
        System.out.println(c+d);
        System.out.print(c);        // without 'ln' no print on new line and print on same line
        System.out.print(d);        //this is difference between println and print- new line and same line printing
        //comparision operators
        //simple comparision
        //if--else loop
        int i=10;
        int j=20;
        if (i<j) {      //if(condition){}else{}
            System.out.println("i is less than j");
        }else
        {   System.out.println("i is greater than j");
        }

        //>,<,<=,>=,!=,==
        //& and

        //if --else loop
        int k=20;
        int l=20;
        if (l==k) {
            System.out.println("k is equal to l");
        }else
        {   System.out.println("k is not equaal to l");

        }

        //While loop
        //disadvantage in while loop is it will give infinite loop if we miss increment/decrement condition
        int x=10;
        int y=20;
               while(x<=y) {
            System.out.println("while loop "+x);
            x++;
        }

        //for loop
        int xx=10;
        int yy=20;

        for (xx=10;xx<=yy;xx++){   // we cant increase 2 by x++ ++ it is not allowed
            System.out.println("for loop using xx++" + x);
        }

      //  or
        yy=30;
        // cant use this condition  y=y+1;
        for (xx=10;xx<=50;xx=xx+1){
            System.out.println("for loop using xx+1 " + xx);
        }

        //print 10 to -10

        for (int gg=10;gg>=-10;gg--){   // we cant increase 2 by x++ ++ it is not allowed
            System.out.println("for loop using xx-- =" + gg);
        }

        //Increment and Decrement
        //Increment ++
        //Decrement --
       int hh=1;
       int mm=hh++;  //post increment //get the value of

        System.out.println(hh);  //2 as its increcread by 1 beacause of post increment in mm
        System.out.println(mm); //

        }

    }

