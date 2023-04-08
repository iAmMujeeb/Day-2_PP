package com.bridgelabz.basics;

// 2 types => primitive and non-primitive
// primitive => byte, short ,int ,long ,float ,double ,char ,boolean
// non-primitive => class, interface ,array
// default value of non-primitive data type is null
// Non-primitive data types can only hold objects
public class DataTypes {

    public static void main(String[] args) {
        // variable => variable is a container for storing some data
        // datatype variable-name = value;
        int x = 10;   // declaration and initialization
        byte y = 23;
        short s = 8;
        long l = 34;
        float f = 3.5f;
        double d = 2.567;
        char c = 'a';
        boolean b = true;
        System.out.println((int)c);

         // !@#$asdsadmkcxmkdsmcdASDASDDVFDSVFSD~

        // byte -> short -> int -> long-> float -> double
        //char->



        System.out.println(x);
        System.out.println(s);
        System.out.println(y);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println();
        System.out.println("**************************************");

        byte var1 = 127;

        float var2 = var1;

        // AutoBoxing ->
        // int to Integer
        //  byte , short , int , long , float , double , char , boolean
        // Integer , Byte , Short , Long , Float , Double , Character , Boolean

        int z = 10;
        Integer integer1 = z;
        System.out.println(var2);

        // There is no requirement of type casting when we are storing lower data type variable into higher data type variable.
        // Whenever we are trying to store a higher data type variable to a lower data type variable , typecasting is mandatory
        // If the value taken in higher data type variable falls in the range of lower data type variable, there will not be any data loss
        // If the value taken in higher data type variable does not fall in the range of lower data type variable, there will be data loss

        long a = -2147483649L;
        int v = (int)a;
        System.out.println("a =>" +a);  // -2147483648
        System.out.println("v => " + v); // -2147483648


        int a1 = -212;
        byte v1 = (byte)a1;

        System.out.println("a1 =>" +a1);  // -21
        System.out.println("v1 => " + v1); // -21


//        String str = "ABC435dsfvvdASDAS";
        // 1 bit = 0/1
        // 1 byte = 8 bits
        // byte	1 byte	Stores whole numbers from -128 to 127
        // short 2 bytes Stores whole numbers from -32,768 to 32,767
        // int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        // long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        // double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits
        // boolean 1 bit	Stores true or false values
        // char 2 bytes	Stores a single character/letter or ASCII values
//
//        String str1 = new String("ABC");

        int var3 = 20;

        byte b1 = 30;
        System.out.println(b1);
        int x1 = b1;
        System.out.println(x1);

        int x2 = 156;
        byte b2 = (byte)x2;
        System.out.println(x2);
        System.out.println(b2);

        int var4 = 10;

        DataTypes obj2 = new DataTypes();

        HelloWorld obj1 = new HelloWorld();


    }
}
