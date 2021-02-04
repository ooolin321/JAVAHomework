package Homework4;

public class Homework4_3 {
    public static void main(String[] args){
        String[] eightplane = {"mercury", "venus", "earth", "mars","jupiter", "saturn", "uranus", "neptune"};
        int count = 0;
        for(int i = 0;i < eightplane.length ;i++){
            for(int j =0;j < eightplane[i].length();j++){
                if(eightplane[i].charAt(j) =='a'||eightplane[i].charAt(j) =='e'||eightplane[i].charAt(j) =='i'||eightplane[i].charAt(j) =='o'||eightplane[i].charAt(j) =='u'){
                    count +=1;
                }
            }
        }
        System.out.println(count);
    }
}
