package Session1.inheritance_demo;

public class Dog extends Animal {

    private String breed;

    public Dog(){}

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void doTrick(){
        System.out.println("dog");
    }

    @Override
    public void talk() {
        System.out.println("Dog is talking");
    }
}
