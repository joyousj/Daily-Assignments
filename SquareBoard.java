//Prints a hash square table 7x7
public class SquareBoard implements ISquare {
	
	public static void main(String[] args) {
		
		int size = 7;
		
		//print board using for loops 
		for(int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	
	}

	@Override
	public void drawSquare() {
		
		
	}
	
	
}
