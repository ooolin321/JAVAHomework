package xxx;

public class Student {
    int score = 60;

    public void play(int hours) {
        score -= hours;
    }

    public void study(int hours) {
        score += hours;
    }

    public static void main(String[] args) {
        Student nisak = new Student();
        nisak.play(5);
        nisak.study(10);
        System.out.println(nisak.score);
    }

}
