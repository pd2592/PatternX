package assignment.acadgild22;

public class PatternX {

	public static void main(String[] args) {
		printX(5);
	}
	public static void printX(int size)
	{
	    for (int i = 0; i < size; i++) {
	        for (int j = 0; j < size; j++) {
	            if (i == j || i + j == size - 1) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}
