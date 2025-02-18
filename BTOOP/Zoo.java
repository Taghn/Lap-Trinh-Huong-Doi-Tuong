public class Zoo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Kiki",200,10,5,true,"Corgi");
        Spider mySpider = new Spider("Spider-man", 2, 3, 20, 20, false );

        myDog.eat("sauces");
        myDog.move(20);
        myDog.bark();
        System.out.println(myDog.getAge()); 

        mySpider.eat("sauces");
        mySpider.move(20);
        mySpider.setName("Venom");
        System.out.println(mySpider.getAge());
    }
}