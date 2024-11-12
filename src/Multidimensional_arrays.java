public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};

        int[][] matrice = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0;i<matrice.length; i+=1){
            for(int j = 0; j<matrice[i].length; j+=1){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }



//        int[] number1 = new int[5];
//        String[][] strings = new String[2][3];
//        strings[0][1] = "Hello";
//        System.out.println(strings[0][1]);
    }




}
