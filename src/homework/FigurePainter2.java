package homework;

import forme.For1;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class FigurePainter2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            System.out.print("*");
            {
                System.out.println();
            }

        }


    }
}