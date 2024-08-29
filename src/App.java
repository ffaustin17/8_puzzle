import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(600, 480);

        Grid grid = new Grid(3,3,50,50,100,200);

        frame.add(grid);

        frame.setVisible(true);


    }
}
