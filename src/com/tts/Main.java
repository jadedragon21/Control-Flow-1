package com.tts;
//import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Use of If-Else Statements: looping through something:
/*    int a = 6;
    if(a == 1) {
        System.out.println("A is 1");

    } else if (a == 2) {
        System.out.println("A is 2");
    }
    else if (a == 3) {
        System.out.println("A is 3");
    }
    else if (a == 4) {
        System.out.println("A is 4");
    } else{
        System.out.println("A is something else!");
    }
*/
        //Example of Switch cases: much more clear although a bit more code:
/*        int a = 0;
        switch (a) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                int b = (a + 5);
                System.out.println("B is:" + b);
                break;
            case 2:
                int c = (a * 5);
                System.out.println("C is: " + c);
                break;
            case 3:
                int d = (a + 50);
                System.out.println(d);
                break;
            case 4:
                System.out.println("We have four");
                break;
            default:
                System.out.println("Nice Car, nothing to see here,  move along");
                break;
*/
 /*       //Use of For Loop
        String[] names = new String[] {"Randy","Aaliyah","Winter","Joi",
                "Ryan","Megan","SeDerek"};
        for (int i=0; i< names.length;i++){
            System.out.println("The current index and name is: " + i + " " + names[i]);
            //System.out.println("The current name is: " + names[i]);

        }
*/
        //Use of Enhanced For Loop
  /*      String[] names = new String[] {"Randy","Aaliyah","Winter","Joi",
                "Ryan","Megan","SeDerek"};
        for (String s : names) {
           System.out.println("Name is:" + s);

    */
 /*   //Use of Nested For Loop
        String[] names = new String[] {"Randy","Aaliyah","Winter","Joi",
                "Ryan","Megan","SeDerek"};
        for (int i=0; i< names.length;i++) {
            System.out.println("The current index and name is: " + i);
            System.out.println("The current name is: " + names[i]);
        }
        for (int j=0; j<20; j++) {
            System.out.print(j);
            for (int k=0; k<20; k++){
                System.out.print("*");
                if (k ==19){
                    System.out.println();
                }
            }
        }
*/
 /*    //Use of While Loop:beware of the infinite loop!
        boolean flag= true;
        int x= 0;

        while (flag) {
            x++;
            System.out.println("This is an infinite Loop!" + x );
            if (x == 55555) {
                flag = false;

            }
        }
*/
  /*      //Use of Do While Loop:beware of the infinite loop!
        boolean flag= true;
        int x= 0;

        do {
            x++;
            System.out.println("This is an infinite Loop!" + x);
            if (x == 55555) {
                flag = false;
            }
            }
        while (flag); {
            System.out.println("Stop! In the name of love!");
*/
        //Use of Ternary Operation: can be used as a replacement for a if else statement: 3 needs: boolean and 2 statements (true and false statements) or methods.
        boolean flag = true;
        int z= (flag ? 3 : 5);
        System.out.println("Z is : " + z);

        int m = (flag ? method1() : method2() );
        System.out.println("M is : " + m);

           }
//usually under the public class main before public static void has to outside of the public static void
    private static int method2() {
        return 5;
    }

    private static int method1() {
        return 3;
    }

}


