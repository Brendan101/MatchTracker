package matchtracker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * Brendan Waters
 * Oct 2, 2015 10:16:58 PM
 * Brenardo9956@gmail.com
 */
public class QueryListener implements ActionListener{
    
    JFrame mainFrame;
    
    public QueryListener(JFrame m){
        
        mainFrame = m;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        mainFrame.setVisible(false);
        QueryFrame qf = new QueryFrame(mainFrame);
        
    }

}
