package Strategy;

public class BWFilter implements Filter {

    @Override
    public void filter(String fileName) {
        System.out.println("Applying Black and Whit filter");
    }
}
