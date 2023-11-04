import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.Objects;

public class Main  extends Frame implements ActionListener {

    public static void createJframe() {
        String button = null;
        final int HEIGHT = 400;
        final int WIDTH = 400;
        JFrame f = new JFrame("Conversions");
        JButton button1, button2, button3;
        button1 = new JButton("Length");
        button1.setBounds(30, 100, 95, 30);
        button2 = new JButton("Area");
        button2.setBounds(130, 100, 95, 30);
        button3 = new JButton("Volume");
        button3.setBounds(230, 100, 95, 30);
        JLabel label = new JLabel("Select one of the below", JLabel.CENTER);
        label.setBounds(100, 20, 150, 30);
        f.add(label);
        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
            button1.addActionListener(e -> {
                JFrame jFrame = new JFrame();
                jFrame.setVisible(true);
                jFrame.setSize(WIDTH, HEIGHT);
                JLabel jLabel = new JLabel("Select a measurement then enter a value.");
                jLabel.setBounds(100,20,150,30);
                jFrame.add(jLabel);
                JMenuItem menuItem = new JMenuItem();
                menuItem.setBounds(150,150,40,50);
                jFrame.add(menuItem);
                JTextField textField = new JTextField();
                textField.setBounds(100,100,50,30);
                //jFrame.add(textField);

            });
            button2.addActionListener(e -> {
                label.setText("Area clicked");
                System.out.println(button2.getText());
            });
            button3.addActionListener(e -> {
                label.setText("Volume clicked");
                System.out.println(button3.getText());
            });

        }


    //create action listeners for button 1
//        if (Objects.equals(button1.getText(), "Length")) {
//            button1.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    label.setText("Clicked");
//                    System.out.println(button1.getText());
//                }
//            });
//        }
//        if (Objects.equals(button2.getText(), "Area")) {
//            button2.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    label.setText("Area clicked");
//                    System.out.println(button2.getText());
//                }
//            });
//        }else
//            button3.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    label.setText("Volume clicked");
//                }
//            });





    @Override
    public void actionPerformed(ActionEvent e) {


    }

    public static void main(String[] args) {
        createJframe();

    }

}
