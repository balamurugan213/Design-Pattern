package Strategy;

public class PngCompressor implements Compressor {


    @Override
    public void compress(String fileName) {
        System.out.println("compressing Using PNG");
    }
}
