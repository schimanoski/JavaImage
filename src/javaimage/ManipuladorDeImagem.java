package javaimage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ManipuladorDeImagem {
        String pathOrigem;
        String pathDestino;
        String pathOrigemNewImage;
        String pathDestinoNewImage;
        
    public void trocarImagemDeLocal(String pathOrigem, String pathDestino, String pathOrigemNewImagem, String pathDestinoNewImagem) throws IOException, NullPointerException{
        this.pathOrigem = pathOrigem;
        this.pathDestino = pathDestino;
        this.pathOrigemNewImage = pathOrigemNewImage;
        this.pathDestinoNewImage = pathDestinoNewImage;
        
        System.out.println(pathOrigem);
        //
        File imagemOrigem = new File(pathOrigem);
        File imagemNewImage = new File(pathOrigemNewImage);
        
        BufferedImage bufferImage = ImageIO.read(imagemOrigem);
        BufferedImage bufferNewImage = ImageIO.read(imagemNewImage);
        
        File imagemDestino = new File(pathDestino);
        File imagemNewImageDestino = new File(pathDestinoNewImage);
        ImageIO.write(bufferImage, "PNG", imagemDestino);
        ImageIO.write(bufferNewImage, "PNG", imagemNewImageDestino);
                
        imagemOrigem.delete();
    }
}
