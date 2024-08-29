import javax.swing.*;

public class Tile extends JButton{
    private int value;
    private String str_rep;

    public void setValue(int val){
        this.value = val;
    }

    public int getValue(){
        return value;
    }

    private void setStrRep(int val){
        this.str_rep = ( val == 0) ? " " : String.valueOf(val);
    }

    public Tile(int val, int x_pos, int y_pos, int width, int height){
        setValue(val);
        setStrRep(val);

        this.setSize(width,height);
        this.setLocation(x_pos, y_pos); // most likely will need to have the location be given to it as parameters.
        this.setText(str_rep);
    }

    
}
