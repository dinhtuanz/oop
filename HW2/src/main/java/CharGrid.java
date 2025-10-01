// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int a=grid.length,b=-1;
		int c=grid[0].length,d=-1;
		int num = 0;
		for(int  i = 0 ; i < grid.length ; i++) {
			for (int j = 0 ; j < grid[0].length ; j++) {
				if(grid[i][j] == ch ) {
					num ++;
					if (i < a) a = i;
					if (i > b) b = i;
					if (j < c) c = j;
					if (j > d) d = j;
				}
				
			}
		}
				if(num == 0) return 0;
				if(num == 1) return 1;

				return (b-1+1)*(d-c+1);
		
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int num = 0;
		for(int i = 2 ; i < grid.length ; i++ ) {
			for ( int j = 2 ; j < grid[0].length ; j++) {
				int a = getlength(grid, i , j);
				if (a>=2) {
					num ++;
				}
			}
		}
		return num; // YOUR CODE HERE
	}
	private static int getlength(char[][] grid, int i , int j) {
		char ch = grid[i][j];
		int up = countDir(grid, i, j, -1, 0, ch);
		int down = countDir(grid, i, j, 1, 0, ch);
		int left = countDir(grid, i, j, 0, -1, ch);
		int right = countDir(grid, i, j, 0, 1, ch);
		if (up == down && up == left && up == right) {
			return up;
		}
		return -1;
	}
	private static int countDir(char[][] grid, int i, int j, int dx, int dy, char ch) {
		int len = 0;
		int r = i + dx;
		int c = j + dy;
		while (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] == ch) {
			len++;
			r += dx;
			c += dy;
		}
		return len;
	}
	
}
