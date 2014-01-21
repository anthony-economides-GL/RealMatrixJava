package realmatrixjava;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;


public class RealMatrixJava {
	
	//attention aux floats : 3.5 et pas 3,5
	static int u=1;
	static double[] P0= {6 , 6 , 6 };	//valeurs ajouté au pif
	static double[] P1= {4 , -6 , 2.5}; //valeurs ajouté au pif
	static double[] D0= {3 , -7 , 1};   //valeurs ajouté au pif
	static double[] D1= {-9 , 2 , 0};   //valeurs ajouté au pif
	
	
	
	public static void main(String[] args) {
	
		//tableaux 1
		double[][] matrixData = { {u^3, u^2, u^1, 0} };
		RealMatrix n = MatrixUtils.createRealMatrix(matrixData);
		
		//tableaux 2
		double[][] matrixData2 = { {2,-2,1,1}, {-3,3,-2,-1}, {0,0,1,0}, {1,0,0,0} };
		RealMatrix m = MatrixUtils.createRealMatrix(matrixData2);
		
		//tableaux 3
		double[][] matrixData3 = { P0, P1, D0, D1 };
		RealMatrix k = MatrixUtils.createRealMatrix(matrixData3);
		//multiplication No1
		
		RealMatrix multip1 = n.multiply(m);
		
		//imprimer le tableaux résultat de la première multiplication
		
		printMatrix(multip1);
		System.out.println("---------------------");
		
		//multiplication No2
		RealMatrix Resultat=multip1.multiply(k);
		
		//imprimer le tableaux résultat de la deuxième multiplication
		printMatrix(Resultat);
	}
	
	private static void printMatrix(RealMatrix matrix){
		double temporaire[];
		for(int i=0;i<3;i++)
		{
			temporaire=matrix.getRow(0);
			for(int j=0;j<3;j++){
				System.out.print(temporaire[j]+" ");
			}
			System.out.println("");
		}
	}
}
