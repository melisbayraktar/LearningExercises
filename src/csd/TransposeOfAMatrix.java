package csd;

import java.util.Scanner;

public class TransposeOfAMatrix {
	public static void main(String[] args) {

		System.out.println("Please enter the row and column value for the matrix: ");
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int column = scan.nextInt();
		
		
		int[][] matrixA = new int[row][column];

		matrixA = matrixCreator(row, column);
		matrixTransposer(row, column, matrixA);  // alternative way for getting the transpose is matrixATranspose[j][i] = matrixA [i][j]; 
		scan.close();
	}

	public static int[][] matrixCreator(int rowValue, int columnValue) {
		int[][] matrix = new int[rowValue][columnValue];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i <= rowValue - 1; i++) {
			for (int j = 0; j <= columnValue - 1; j++) {
				System.out.println("Please enter the " + (i + 1) +", " + (j + 1) + " th value");
				matrix[i][j] = scan.nextInt();
			}
		}

		System.out.println("Your matrix is: ");
		
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				System.out.print(matrix[r][c] + "\t");
			}
			System.out.println();
		}
		scan.close();
		return matrix;
	}
	
	public static int[][] matrixTransposer(int rowValueT, int columnValueT, int[][] matrixT){
		
		int[][] matrixTranspose = new int[columnValueT][rowValueT];
		
		for (int i = 0; i <= columnValueT - 1; i++) {
			for (int j = 0; j <= rowValueT - 1; j++) {
				matrixTranspose[i][j] = matrixT[j][i];

			}
		}
		
		System.out.println("Transpose of your matrix is: ");
		
		for (int r = 0; r < matrixTranspose.length; r++) {
			for (int c = 0; c < matrixTranspose[0].length; c++) {
				System.out.print(matrixTranspose[r][c] + "\t");
			}
			System.out.println();
		}
		
		return matrixTranspose;
	}
	

}
