package Matrix;

public class main {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {5,6,7},
                       {8,9,10}};
        TransposeOfMatrix.displayMatrix(arr);
//        arr = TransposeOfMatrix.TransPose(arr);
        System.out.println();
        TransposeOfMatrix.displayMatrix(TransposeOfMatrix.Rotate_90(arr));
    }
}
