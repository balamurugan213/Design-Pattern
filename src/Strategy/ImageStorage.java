package Strategy;

public class ImageStorage
{
    private  Compressor compressor;
    private  Filter filter;

    public ImageStorage(Compressor compressor,Filter filter) {
        this.compressor = compressor;
        this.filter=filter;
    }

    public ImageStorage(){
        System.out.println("Simple Storage Initiated");
    }


    public void store(String fileName){
//        -----Old implementation
//        if(compressor=="jpeg"){
//            System.out.println("Compressing using JPEG");
//        }
//        else if(compressor=="PNG"){
//            System.out.println("Compressing using PNG");
//        }
//        if (filter=="b&w"){
//            System.out.println("Applying B&W filter");
//        }
        compressor.compress(fileName);
        filter.filter(fileName);
    }

    public void store(String fileName,Compressor newCompressor,Filter newFiler){
        newCompressor.compress(fileName);
        newFiler.filter(fileName);
    }
}
