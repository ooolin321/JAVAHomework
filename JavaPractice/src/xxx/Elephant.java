package xxx;

public class Elephant extends Animal {
    private String name;

    public Elephant(){

    }

    public Elephant(int age,float weight,String name){
        super(age,weight);
        this.name = name;
    }

    public void speak(){
        super.speak();
        System.out.println("Name is "+name);
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
