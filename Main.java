package ImageProject;


import ImageProject.functions.FilterOperation;
import ImageProject.utils.ImageUtils;
import ImageProject.utils.RgbMaster;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
       final BufferedImage image = ImageUtils.getImage("images/h.png");
       final RgbMaster rgbMaster = new RgbMaster(image);
       rgbMaster.changeImage(FilterOperation::onlyGreen);
       ImageUtils.saveImage(rgbMaster.getImage(),"images/cloned_h.png");




    }
}
