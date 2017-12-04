package Day3;

// lower than 410744

public class Day3Part3 {
	public static void main(String[] args){
		int input = 312051;
		int size = 100;


		int[][] grid = new int[size][size];

		int zeros = ((size - 1) / 2) + 1;
		int numToPlace = 1;
		String direction = "right";


		grid[zeros][zeros] = 1;
		int xcoord = zeros;
		int ycoord = zeros;

		for(int i = 0; numToPlace <= input; i++){
			if (direction.equals("right")){
				xcoord = xcoord + 1;
				if (grid[xcoord][ycoord-1] == 0){
					direction = "up";
				}
			} else if (direction.equals("left")){
				xcoord = xcoord - 1;
				if (grid[xcoord][ycoord+1] == 0){
					direction = "down";
				}
			} else if (direction.equals("up")){
				ycoord = ycoord - 1;
				if (grid[xcoord-1][ycoord] == 0){
					direction = "left";
				}
			} else if (direction.equals("down")){
				ycoord = ycoord + 1;
				if (grid[xcoord+1][ycoord] == 0){
					direction = "right";
				}
			}

			numToPlace = grid[xcoord-1][ycoord-1] + grid[xcoord][ycoord-1] + grid[xcoord+1][ycoord-1] + grid[xcoord-1][ycoord] + grid[xcoord+1][ycoord] + grid[xcoord-1][ycoord+1] + grid[xcoord][ycoord+1] + grid[xcoord+1][ycoord+1];

			grid[xcoord][ycoord] = numToPlace;
			System.out.println("numToPlace: " + numToPlace);
		}
	}
}
