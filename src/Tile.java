import javax.swing.*;

public class Tile extends JButton{
    private int value;
    private String str_rep;

    private Tile left; 
    private Tile right; 
    private Tile up; 
    private Tile down; 

    public void assignLeftNeighbor(Tile neighbor){
        left = neighbor;
    }

    public void assignRightNeighbor(Tile neighbor){
        right = neighbor;
    }

    public void assignUpNeighbor(Tile neighbor){
        up = neighbor;
    }

    public void assignDownNeighbor(Tile neighbor){
        down = neighbor;
    }

    public void setValue(int val){
        this.value = val;
    }

    public int getValue(){
        return value;
    }

    private void setStrRep(int val){
        this.str_rep = ( val == 0) ? " " : String.valueOf(val);
    }

    public Tile(int val){
        this.left = null;
        this.right = null;
        this.up = null;
        this.down = null;
        
        setValue(val);
        setStrRep(val);

        //this.setSize(100,100);
        //this.setLocation(x_pos, y_pos); // most likely will need to have the location be given to it as parameters.
        this.setText(str_rep);
    }

    
}
