package matchtracker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * Brendan Waters
 * Oct 2, 2015 10:15:10 PM
 * Brenardo9956@gmail.com
 */
public class EnterListener implements ActionListener{
    
    JFrame mainFrame;
    
    public EnterListener(JFrame m){
        
        mainFrame = m;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        mainFrame.setVisible(false);
        
        MatchFrame mf = new MatchFrame(mainFrame);
        
    }

}
