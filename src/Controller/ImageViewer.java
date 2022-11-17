/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Image;
import Persistance.FileImageLoader;
import java.io.File;
import javax.swing.JOptionPane;
/**
 *
 * @author Abel
 */
public class ImageViewer {

    public static void main(String[] args) {
        File file = new File("./");
        FileImageLoader imageLoader = new FileImageLoader(file);

        Image image = imageLoader.load();
        
        
        if(image != null){
            MainFrame mainFrame = new MainFrame(imageLoader);
            mainFrame.getImageDisplay().show(image);
        }else{
            System.out.println("No se han encontrado imágenes");
            JOptionPane.showMessageDialog(null,"No se han encontrado imagenes");
        }
    }

}
