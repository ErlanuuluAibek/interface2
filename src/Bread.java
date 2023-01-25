public class Bread implements Baked{
    @Override
    public void cook() {
        System.out.println("bread is cook");
    }

    @Override
    public void cookingTime() {
        System.out.println("bread is cooking time 45-50min");
    }
}
