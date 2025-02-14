public class Animal{
    private String name;
    private int size;
    private int weight;
    private int age;

    public Animal(String name, int size, int weight, int age)
    {
        this.name=name;
        this.size=size;
        this.weight=weight;
        this.age=age;
    }

    public void eat(String food){
        System.out.printf("The %s is eating %s!\n",getName(),food);
    }
    public void move(int velocity){
        System.out.printf("The %s is moving %d km/h!\n", getName(),velocity);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int weight){
        this.size=size;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}