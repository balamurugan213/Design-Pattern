package Strategy;

public class VintageFilter implements Filter {
    @Override
    public void filter(String fileName) {
        System.out.println("Applying vintage Filter");
    }
}
