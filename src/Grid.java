import javax.swing.*;
import java.util.*;
import java.awt.*;


public class Grid extends JPanel{
    //grid matrix features
    private final int num_rows;
    private final int num_cols;
    private ArrayList<Tile> grid_matrix;

    //Panel information
    private final int width;
    private final int height;
    private final int x_pos;
    private final int y_pos;

    private ArrayList<Integer> possible_tile_vals = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8));


    private void populateGrid(int grid_x_pos, int grid_y_pos, int tile_w, int tile_h, int num_rows, int num_cols){
        Random rand = new Random();
        int rand_index;
        int rand_val;

        Tile tile = null;
        int tile_x_pos = grid_x_pos;
        int tile_y_pos = grid_y_pos;

        for(int i = 0; i < num_rows; i++){

            for(int j = 0; j < num_cols; j++){

                rand_index = rand.nextInt(possible_tile_vals.size());
                rand_val = possible_tile_vals.get(rand_index);
                tile = new Tile(rand_val, tile_x_pos, tile_y_pos, tile_w, tile_h);
                this.add(tile);

                //remove the value from the list of possible values since it has already been chosen
                possible_tile_vals.remove(rand_index);

                //end of one tile - update the tile x pos
                tile_x_pos += tile_w;

            }

            //end of a row - update the next tile y pos. Reset tile x pos
            tile_y_pos += tile_h;
            tile_x_pos = grid_x_pos;
        }
    }

    public Grid(int num_rows, int num_cols, int tile_width, int tile_height, int grid_x_pos, int grid_y_pos){
        this.num_rows = num_rows;
        this.num_cols = num_cols;
        this.width = tile_width * num_cols;
        this.height = tile_height * num_rows;

        this.x_pos = grid_x_pos;
        this.y_pos = grid_y_pos;

        
        //we add the tiles to the grid
        populateGrid(this.x_pos, this.y_pos, tile_width, tile_height, num_rows, num_cols);
        this.setLayout(new GridLayout(num_rows, num_cols));
        this.setSize(400,400);

    }

}
