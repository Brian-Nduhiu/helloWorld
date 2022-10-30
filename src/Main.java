import primitiveDataTypes.PrimitiveDataTypes;
import casting.Casting;
import arrays.Arrays;
import strings.strings;
import unaryOperators.UnaryOperators;

public class Main  {
    public static void main(String[] args){

        //primitive data types
        PrimitiveDataTypes.primitiveDataTypes();
        System.out.println(".................................");
        //Strings
        strings.strings();
        System.out.println(".................................");
        //Arrays
        Arrays.arrays();
        System.out.println(".................................");
        //Explicit Data Conversion / Data Casting
        Casting.casting();
        System.out.println(".................................");
        //import
        test.package1.TestClass.hello();
        System.out.println(".................................");
        //Unary Operators
        UnaryOperators.unaryOperator();
        System.out.println(".................................");
    }
}