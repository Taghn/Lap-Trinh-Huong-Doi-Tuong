public class Dog extends Animal{
    private boolean friendly;
    private String breed;

    public Dog(String name, int size, int weight, int age, boolean friendly, String breed) {
        super(name, size, weight, age);
        this.friendly=friendly;
        this.breed=breed;
    }

    public void bark(){
        System.out.println("The dog is barking!");
    }
    public boolean isFriendly(){
        return friendly;
    }
    public void setFriendly(boolean friendly){
        this.friendly=friendly;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
}
