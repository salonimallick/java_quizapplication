import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class login extends JFrame{

    login(){
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/quiztime.jpeg"));
        JLabel img = new JLabel(i1);
        add(img);
        setSize(1200, 500);
        setLocation(200, 200);
        setVisible(true);
    }
    public static void main(String[] args){
        new login();  //anonymous object
    }
}
