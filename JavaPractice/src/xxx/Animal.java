package xxx;

public class Animal {
    private int age;
    private float weight;

    public Animal(){

    }

    public Animal(int age,float weight){
        this.age = age;
        this.weight = weight;
    }

    public void speak(){
        System.out.println("Age is " +age);
        System.out.println("Weight is "+weight);
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public float getWeight(){
        return weight;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }
}
