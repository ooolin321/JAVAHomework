package xxx;

public class CubeTest {
    public static void main(String[] args){
        try{
            Cube cube = new Cube(2);

            Cube cube2 = new Cube();
            cube2.setLength(5);
            System.out.println(cube.getVolume());
        }catch (CubeException c){
            c.printStackTrace();
        }
    }
}
