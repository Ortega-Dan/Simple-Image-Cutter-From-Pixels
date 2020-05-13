package org.danort;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

import javax.imageio.ImageIO;

public class App {

    public static void main(String[] args) throws Exception {

        BufferedImage image = ImageIO.read(new File(args[0]));

        // "845" VPOS="622" WIDTH="1450" HEIGHT="219"

        int x1 = Integer.parseInt(args[1]);
        int y1 = Integer.parseInt(args[2]);
        int x2 = Integer.parseInt(args[3]);
        int y2 = Integer.parseInt(args[4]);

        String fileType = args[5].substring(args[5].length() - 3, args[5].length());

        ImageIO.write(image.getSubimage(x1, y1, x2 - x1, y2 - y1), fileType, new FileOutputStream(args[5]));

    }

}