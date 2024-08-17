import java.util.*;


public class ThreeDArraySorting {
    public static void main(String[] args) {
        int x = 3; 
        int y = 4; 
        int z = 5; 

        int[][][] threeDArray = new int[x][y][z];

        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    threeDArray[i][j][k] = random.nextInt(100); 
                }
            }
        }

        System.out.println("Original 3D Array:");
        print3DArray(threeDArray);

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    Arrays.sort(threeDArray[i][j]);
                }
            }
        }
        System.out.println("\nSorted 3D Array:");
        print3DArray(threeDArray);
    }

    private static void print3DArray(int[][][] array) {
        for (int[][] subArray2D : array) {
            for (int[] subArray1D : subArray2D) {
                System.out.println(Arrays.toString(subArray1D));
            }
            System.out.println();
        }
    }
}
