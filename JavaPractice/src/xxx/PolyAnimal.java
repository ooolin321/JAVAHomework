package xxx;

public class PolyAnimal {
    public static void main(String[] args){
        Animal[] array = new Animal[2];
        array[0] = new Animal(2,5.0f);
        array[1] = new Elephant(3,2500f,"brace");
        for(int i = 0;i <array.length;i++){
            array[i].speak();
        }
    }
}
