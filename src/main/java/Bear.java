public class Bear {
    private String name;
    private int age;
    private double weight;
    private boolean asleep;

    public Bear(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
}
