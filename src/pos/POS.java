/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import com.alee.laf.WebLookAndFeel;
import com.alee.laf.rootpane.WebDialog;
import dbqueryprocessor.DBQueryProcessor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import pos.connection.DBConnection;
import pos.ui.Login;

/**
 *
 * @author Gerardo
 */
public class POS {

    /**
     * @param args the command line arguments
     */
    static DBConnection con;
    
    public static void main(String[] args) {
        LookAndFeel laf = new WebLookAndFeel();
        try {
            //set look and feels
            UIManager.setLookAndFeel(laf);
            WebLookAndFeel.setDecorateAllWindows(true);
            //database connection
            con = new DBConnection();
            con.setConnection();
            //prepare login frame
            Login m_frame = new Login(new WebDialog(), true);
            m_frame.setLocationRelativeTo(null);
            m_frame.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
