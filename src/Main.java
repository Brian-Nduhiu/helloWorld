import java.util.Arrays;

public class Main  {
    public static void main(String[] args){

        //primitive data types
//        char letter = 'A';
//        byte constant = 4;
//        short percent = 83;
//        int amount = 34993322;
//        float interest = 12.5f;
//        double pi = 3.14159265359d;
//        boolean hasAccount = true;
//
//        System.out.println("Char - "+letter);
//        System.out.println("byte - "+constant);
//        System.out.println("Short - "+percent);
//        System.out.println("Int - "+amount);
//        System.out.println("Float - "+interest);
//        System.out.println("Double - "+pi);
//        System.out.println("Boolean - "+hasAccount);


        //Strings
//        String name = "Brian";
//        String bank = new String("NCBA");
//        System.out.println("Name - "+name);
//        System.out.println("Bank - "+bank);


        //Arrays
//        int[] list;
//        list = new int[4];
//        list[0]= 13;
//        list[1]= 32;
//        list[2]= 66;
//        list[3]= 31;
//
//        System.out.println(Arrays.toString(list));

//        char uni = 'A';
//        System.out.println("Uni char is " + uni);


//        int[] array = new int[n];
//        for (int i = 1; i <= n; i++) {
//            array[i-1] = x * i;
//
//        }
//        System.out.println(Arrays.toString(array));

//        String x = "Jamal ";
//        int n = 10;
//        System.out.println(x.repeat(n));


        String num = "2454984893271922453478";
        String result = "";
        char[] numArray = num.toCharArray();

        for (char item: numArray) {
            if(Character.getNumericValue(item) < 5){
                result += '0';
            }
            else {
                result += '1';
            }
        }
        System.out.println(result);
        }

    }
