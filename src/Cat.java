public class Cat extends Animal implements Moveable{
    public Cat(String name) {
        super(name);
        this.type="Kotek";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void start() {
        System.out.println("Kotek biega");
    }

    @Override
    public void stop() {
        System.out.println("Kotek odpoczywa");
    }
}