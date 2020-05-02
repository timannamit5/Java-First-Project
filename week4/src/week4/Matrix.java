package week4;

public class Matrix {

	public static void main(String[] args) {
	  Mat matrix =new Mat();
	  matrix.read();
	  matrix.isScalar();
	  matrix.display();
	  Mat matrix2 =new Mat();
	  matrix2.read();
	  //matrix.multiply(matrix2);
	  matrix.add(matrix2);
  
	}


}
