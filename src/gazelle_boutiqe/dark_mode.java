/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gazelle_boutiqe;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Component;
/**
 *
 * @author Zaki_shah
 */
public class dark_mode {
    private static boolean isDarkMode;
        public static void applyTheme(JFrame frame){
            if(isDarkMode==true){
                frame.getContentPane().setBackground(Color.black);
                applyToAllComponents(frame.getContentPane().getComponents(), Color.BLACK, Color.WHITE);
            }else{
                 frame.getContentPane().setBackground(Color.WHITE);
                 applyToAllComponents(frame.getContentPane().getComponents(), Color.white, Color.black);
            }
        
         }
        public static void switchDarkmode(){
            isDarkMode= !isDarkMode;
        }
        private static void applyToAllComponents(Component[] components, Color bgColor, Color fgColor){
            for(Component component: components){
                if(component instanceof JPanel){
                    component.setBackground(bgColor);
                    applyToAllComponents(((JPanel)component).getComponents(), bgColor, fgColor);
                }else{
                    component.setBackground(bgColor);
                    component.setForeground(fgColor);
                }
            }
        }
}
