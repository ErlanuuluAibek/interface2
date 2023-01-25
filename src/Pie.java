public class Pie implements Baked{
    @Override
    public void cook() {
        System.out.println("pie is cook");
    }

    @Override
    public void cookingTime() {
        System.out.println("pie is cooking time 30-40min");
    }
}
