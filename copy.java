import javax.swing.*;
import java.awt.*;

public class copy{
    public static void main(String[] args) {
        if(GraphicsEnvironment.isHeadless){
            System.out.println("headless environment detected, GUI programing is not supported");
            return;
        }

        SwingUtilities.invokelater(new Runnable() {
            public void run(){
                JFrame frame=new JFrame(title:"window without applet");
                frame.setSize(1600, 900);
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);


                JLabel label=new JLabel("this is your window without applet");


                frame.getContentPane().add(label); 








                 frame.setVisible(true)
            }
        



    }
}

