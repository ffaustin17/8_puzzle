import javax.swing.*;
import java.util.*;
import java.awt.*;


public class Grid extends JPanel{
    //grid matrix features
    //private final int num_rows;
    //private final int num_cols;
    private ArrayList<Tile> grid_matrix;
    private int[] empty_tile_pos = new int[2];

    //Panel information
    //private final int width;
    //private final int height;
    //private final int x_pos;
    //private final int y_pos;

    private ArrayList<Integer> possible_tile_vals = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8));


    private void populateGrid(int num_rows, int num_cols){
        Random rand = new Random();
        int rand_index;
        int rand_val;

        Tile tile = null;
        

        JPanel actual_grid = new JPanel();
        //actual_grid.setBackground(Color.BLUE);
        //actual_grid.setSize(400,200);
        actual_grid.setLayout(new GridLayout(num_rows, num_cols));
        

        for(int i = 0; i < num_rows; i++){

            for(int j = 0; j < num_cols; j++){

                rand_index = rand.nextInt(possible_tile_vals.size());
                rand_val = possible_tile_vals.get(rand_index);
                
                //get the position of the empty tile at initialization
                if(rand_val == 0){
                    empty_tile_pos[0] = i;
                    empty_tile_pos[1] = j;
                }

                tile = new Tile(rand_val);
                actual_grid.add(tile);

                //remove the value from the list of possible values since it has already been chosen
                possible_tile_vals.remove(rand_index);

                //end of one tile - update the tile x pos
                //tile_x_pos += tile_w;

            }

            //end of a row - update the next tile y pos. Reset tile x pos
            //tile_y_pos += tile_h;
            //tile_x_pos = grid_x_pos;
        }

        //actual_grid.setSize(220,220);
        //actual_grid.setBackground(Color.white);
        //actual_grid.setOpaque(true);
        this.add(actual_grid);

    }

    public Grid(int num_rows, int num_cols){
        //this.setBackground(Color.blue);
        //this.setOpaque(true);
        populateGrid(num_rows, num_cols);
        
        

    }

}
