/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import Model.Image;

public interface ImageLoader {
    
    public Image load();
    
    public Image next();
    public Image prev();
    
}
