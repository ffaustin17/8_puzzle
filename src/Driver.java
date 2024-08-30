import java.awt.BorderLayout;

import javax.swing.*;


public class Driver {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400, 280);

        Grid grid = new Grid(3,3);

        frame.add(grid, BorderLayout.CENTER);

        frame.setVisible(true);


    }
}
