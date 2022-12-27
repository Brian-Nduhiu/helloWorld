package arrays;

public class Arrays {
    public static void arrays(){
        int[] list;
        list = new int[4];
        list[0]= 13;
        list[1]= 32;
        list[2]= 66;
        list[3]= 31;

        System.out.println(java.util.Arrays.toString(list));

        int[][] table = {{1,5,4},{6,7,2},{9,3,2}};
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(table[i][j] + " ");
//
//            }

        //Enhanced For Loop
            for (int[] rows: table) {
                for (int columns: rows) {
                    System.out.print(columns + " ");

                }
            System.out.println();
        }
        
    }
}
