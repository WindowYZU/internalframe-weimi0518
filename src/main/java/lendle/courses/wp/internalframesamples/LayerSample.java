/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.internalframesamples;

import java.awt.BorderLayout;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class LayerSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        JDesktopPane desktopPane = new JDesktopPane();
        frame.setContentPane(desktopPane);
        //experiment with JDesktopPane.xxxLAYER
        JButton button1=new JButton("button1");
        button1.setBounds(0, 0, 100, 50); // (x, y, width, height)
        desktopPane.add(button1, JDesktopPane.DRAG_LAYER);
        
        JButton button2=new JButton("button2");
        button2.setBounds(50, 0, 100, 50);
        desktopPane.add(button2, JDesktopPane.DEFAULT_LAYER);
        //JDesktopPane.深度
        //DEFAULT_LAYER -> 0
        //PALETTE_LAYER -> 100
        //MODAL_LAYER -> 200
        //POPUP_LAYER -> 300
        //DRAG_LAYER -> 400
        ///////////////////////////////////////////////////////
        ImageIcon icon = new ImageIcon(new URL("https://www.dhresource.com/0x0s/f2-albu-g5-M00-0F-27-rBVaJFiid_KAWQTEAACJzY-3dS4814.jpg/hot-sale-for-peanuts-snoopy-love-vinyl-funny.jpg"));
        JLabel label = new JLabel(icon);
        label.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        desktopPane.add(label, Integer.MIN_VALUE);

        frame.setVisible(true);
    }

}
