import java.awt.*;

import javax.swing.*;


public class Driver {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("8 Puzzle Game");
        ImageIcon icon = new ImageIcon("number_8.png");
        frame.setIconImage(icon.getImage());
        JPanel container = new JPanel();
        JLabel game_title = new JLabel("8 Puzzle Game.");
        game_title.setFont(new Font("Arial", Font.CENTER_BASELINE,20));
        //game_title.setBackground(Color.green);
        //game_title.setOpaque(true);
        container.add(game_title);
        JLabel instructions = new JLabel("Move the Empty Tile by pressing up, down, left, or right until the grid is sorted in ascending order.");
        
        //Create the menu bar.  Make it have a green background.
        //JMenuBar greenMenuBar = new JMenuBar();
        //greenMenuBar.setOpaque(true);
        //greenMenuBar.setBackground(new Color(154, 165, 127));
        //greenMenuBar.setPreferredSize(new Dimension(200, 20));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(420, 420);

        frame.add(container, BorderLayout.NORTH);

        //JPanel myPanel = new JPanel();
        //myPanel.setSize(300,300);
        //myPanel.setBackground(Color.CYAN);
        //myPanel.setOpaque(true);

        //JPanel container = new JPanel();
        //container.setLayout(new FlowLayout());
        //container.add(myPanel);
        //frame.add(container, BorderLayout.CENTER);
        Grid grid = new Grid(3,3);

        frame.add(grid, BorderLayout.CENTER);
        frame.add(instructions, BorderLayout.SOUTH);
        //frame.setJMenuBar(greenMenuBar);
        frame.setResizable(false);
        frame.setVisible(true);


    }
}
