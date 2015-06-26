package matrix;

public class Matrix {
	public static double matrix(int n){
		double[][] a = new double[n][n];
		double[][] b = new double[n][n];
		double[][] c = new double[n][n];
		int i, j;
		for(i = 0; i < n; i++){
			for(j = 0; j < n; j++){
				a[i][j] = i * n + j;
				b[i][j] = j * n + i;
				c[i][j] = 0;
			}
		}
		for(i = 0; i < n; i++){
			for(j = 0; j < n; j++){
				for(int k = 0; k < n; k++){
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		double sum = 0;
		for(i = 0; i < n; i++){
			for(j = 0; j < n; j++){
				sum += c[i][j];
			}
		}
		return sum;
	}
}
