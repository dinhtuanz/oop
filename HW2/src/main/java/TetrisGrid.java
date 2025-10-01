//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	private boolean [][] grid;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = grid;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		int w = grid.length;
		int h = grid[0].length;

		int newRow = 0;
		for (int y = 0; y < h; y++) {
			if (!isFullRow(y)) {
				for (int x = 0; x < w; x++) {
					grid[x][newRow] = grid[x][y];
				}
				newRow++;
			}
		}
		for (int y = newRow; y < h; y++) {
			for (int x = 0; x < w; x++) {
				grid[x][y] = false;
			}
		}
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {

		return grid; // YOUR CODE HERE
	}
	private boolean isFullRow(int y) {
		for (int x = 0; x < grid.length; x++) {
			if (!grid[x][y]) return false;
		}
		return true;
	}
}
