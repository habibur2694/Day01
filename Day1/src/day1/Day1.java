// Java Home
package day1;
public class Day1 {
    public static void main(String[] args) {    // The main method
        System.out.println("Hello World!");      // The Output method
        
        
                         // java variable
        // String
        String name;
        name= "Hello world";
         System.out.println(name);
         
         // integer
         int num;
         num = 2694;
          System.out.println("My integer Number is "+num);
          
          // float
          float num1;
          num1 =26.94f;
           System.out.println("My Float Number is "+num1);
           
           //characters
           char word;
           word ='H';
            System.out.println("My Word is "+word);
            
            // boolean
            boolean first;
            boolean sceond;
            first = true;
             sceond = false;
            
             System.out.println("The value is "+first);
             System.out.println("The value is "+sceond);
         
             
                            //jata data types
                            
       int myNum = 5;               // integer (whole number)
       float myFloatNum = 5.99f;    // floating point number
       char myLetter = 'D';         // character
       boolean myBool = true;       // boolean
       String myText = "Hello";     // String 
       
       System.out.println("Data types  "+myNum +myFloatNum +myLetter  +myBool +myText);
       
       {
           byte myByte = 100;
           System.out.println(myByte);
       }
       {
           short shortVariable=5000;
           System.out.println(shortVariable);
       }
       {
           long longVariable=500000000000L;
           System.out.println(longVariable);
       }
       {
           double doubleVariable=26.94D;
           System.out.println(doubleVariable);
       }
                            // Type Casting
       {
           int numm1=9;
           double num2 = numm1;
           System.out.println(numm1);
           System.out.println(num2);
       }
                //Narrowing Casting
       {
           double nummm1=9.99;
           int num3 = (int)nummm1;
           System.out.println(nummm1);
           System.out.println(num3);
       }
                          // Java Operators
       {
           int x= 26+94;
           System.out.println(x);
       }
       {
           int sum1= 5+5;
            int sum2 = sum1+10;
            int sum3 = sum1+ sum2;
           System.out.println(sum1);
           System.out.println(sum2);
           System.out.println(sum3);
       }
                                          // Arithmetic Operators
       {
           int a=5;
           int b=5;
           int sum9=a+b;
           int sum4=a-b;
           int sum5=a*b;
           int sum6=a/b;
           int sum7=a%b;
           int y=a&b;
           int e=a|b;
            System.out.println(sum9);
            System.out.println(sum4);
            System.out.println(sum5);
            System.out.println(sum6);
            System.out.println(sum7);
            System.out.println(y);
            System.out.println(e);
            System.out.println(a==b);
            System.out.println(a!=b);
            System.out.println(a>b);
            System.out.println(a<b);
            System.out.println(a<=b);
            System.out.println(a>=b);
       }
              // String
       {
            String txt = "HabiburRahman";
            System.out.println("The length  " + txt.length());
            
       }
       {
           String txt1 = "HabiburRahman";
           System.out.println(txt1.toUpperCase());
           System.out.println(txt1.toLowerCase());

       }
       {
        String txt3 = "26";
        String txt4 = "94";
        String txt5 = txt3 + txt4;
        System.out.println(txt5);
        
       }
                                    // Math
       {
           System.out.println(Math.max(5,6));
           System.out.println(Math.sqrt(81));
       }
       {
            int x = 20;
            int y = 18;
            if (x > y) {
           System.out.println("x is greater than y");
       }
            {
                int time = 20;
              if (time < 18) {
                 System.out.println("Good day.");
              } 
              else {
              System.out.println("Good evening.");
               }
    }
    }
    
