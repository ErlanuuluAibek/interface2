public class Cookie implements Baked{

    @Override
    public void cook() {
        System.out.println("Cookie is cook");
    }

    @Override
    public void cookingTime() {
        System.out.println("Cookie is cooking 20-25min");
    }
}
