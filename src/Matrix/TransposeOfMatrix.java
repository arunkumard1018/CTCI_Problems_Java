package Matrix;

public class TransposeOfMatrix {
    public static int[][] TransPose(int[][] arr) {
        if(arr.length != arr[0].length) return new int[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j< arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    public static int[][] SwapMatrix(int[][] arr) {
        int n = arr.length;
        for(int i=0 ;i<arr.length;i++){
            for (int j = 0; j < n/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp;
            }
        }
        return arr;
    }

    public static int[][] Rotate_90(int[][] arr) {
        arr = TransPose(arr);
        return SwapMatrix(arr);
    }
    public static void displayMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
