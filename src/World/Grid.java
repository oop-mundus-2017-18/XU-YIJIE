package World;

public class Grid {
    private int height;
    private int width;
    private Point[][] grid;
    Grid(int height,int width){
        this.height = height;
        this.width = width;
        this.grid = new Point[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                grid[i][j] = new Point(null,i,j);
            }
        }
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
}
