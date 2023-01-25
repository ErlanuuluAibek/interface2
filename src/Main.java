import java.nio.channels.Pipe;

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread();
        Pie pie = new Pie();
        Bun bun = new Bun();
        Cookie cookie = new Cookie();
        Baked[] bakeds = {bread, pie, bun, cookie};
        for (Baked bak : bakeds) {
            bak.cook();
            bak.cookingTime();
        }
    }
}