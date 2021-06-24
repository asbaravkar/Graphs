public class MatrixRepresentation {
    public static void main(String[] args) {
        int n = 3, m = 3;
        int[][] adjMat = new int[n+1][m+1];

        // matrix can be boolean or integer
        // to add edge between 1-->2 (directed)
        adjMat[1][2] = 1;

        // to add edge undirected 3--4
        adjMat[3][4] = 1;
        adjMat[4][3] = 1;
    }
}
