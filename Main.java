import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        //create jframe object to hold buttons and label
        JFrame f = new JFrame("Conversions");
        JButton button1, button2, button3;
        button1 = new JButton("Length");
        button1.setBounds(30,100,95,30);
        button2 = new JButton("Area");
        button2.setBounds(130,100,95,30);
        button3 = new JButton("Volume");
        button3.setBounds(230,100,95,30);
        JLabel label = new JLabel("Select one of the below", JLabel.CENTER);
        label.setBounds(100,20,150,30);
        f.add(label);
        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);



    }
}
