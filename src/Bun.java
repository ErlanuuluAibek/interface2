public class Bun implements Baked{
    @Override
    public void cook() {
        System.out.println("Bun probably");
    }

    @Override
    public void cookingTime() {
        System.out.println("Bun is cooking time 20-25min");
    }
}
