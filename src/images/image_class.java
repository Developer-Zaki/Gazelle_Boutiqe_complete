
package images;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Color;
//import javafx.scene.paint.Color;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class image_class extends JPanel{
    public static void setImage(JFrame frame, String imagePath, int newWeidth, int newHeight){
        try{
            BufferedImage orgImage=ImageIO.read(image_class.class.getResourceAsStream(imagePath));
            BufferedImage resizedImage=new BufferedImage(newWeidth, newHeight, BufferedImage.TYPE_INT_RGB);
            resizedImage.createGraphics().drawImage(orgImage.getScaledInstance(newWeidth, newHeight, Image.SCALE_SMOOTH), 0, 0,null);
            ImageIcon backgroundImage=new ImageIcon(resizedImage);
            JLabel backgroundLabel=new JLabel(backgroundImage);
            backgroundLabel.setBounds(0,0,newWeidth,newHeight);
            //frame.getContentPane().add(backgroundLabel,BorderLayout.CENTER);
            frame.validate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }


    
   /* private static HashMap<String,JFrame> formsMap=new HashMap<>();
    
    public static void openForm(String formName, JFrame formInstance){
        JFrame existingForm=formsMap.get(formName);
        if(existingForm==null || !existingForm.isVisible()){
            formsMap.put(formName, formInstance);
            formInstance.setVisible(true);
        } else{
            existingForm.toFront();
        }
    }
    public static String getPath(String finalPath){
        String projectPath=System.clearProperty("user.dir");
        return projectPath+"\\src\\"+finalPath;
    }
    public static String getFileExtenison(String fileName){
        int lastDotIndex =fileName.lastIndexOf(".");
        if(lastDotIndex !=-1){
            return fileName.substring(lastDotIndex+1);
        }
        return "";
    }
    public static BufferedImage scaleImage(BufferedImage orgImage, BufferedImage selectedIamge){
        int width= selectedIamge.getWidth();
        int height= selectedIamge.getHeight();
        BufferedImage scaledImage= new BufferedImage(width, height, orgImage.getType());
        scaledImage.createGraphics().drawImage(orgImage.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
        return scaledImage;
    }
*/
   


}
