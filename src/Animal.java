public abstract class Animal {
    private String name;
    protected String type;

    public Animal(String name) {
        this.name = name;
    }
    public  String getName(){
        return name;
    }
    public abstract String getType();
}