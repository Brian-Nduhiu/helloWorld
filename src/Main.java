
import test.package1.TestClass;
import primitiveDataTypes.PrimitveDataTypes;
import casting.casting;

import arrays.arrays;
import strings.strings;

public class Main  {
    public static void main(String[] args){

        //primitive data types
        primitiveDataTypes.PrimitveDataTypes.primitiveDataTypes();
        System.out.println(".................................");
        //Strings
        strings.strings();
        System.out.println(".................................");
        //Arrays
        arrays.arrays();
        System.out.println(".................................");
        //Explicit Data Conversion / Data Casting
        casting.casting();
        System.out.println(".................................");
        //import
        test.package1.TestClass.hello();
        System.out.println(".................................");

    }
}