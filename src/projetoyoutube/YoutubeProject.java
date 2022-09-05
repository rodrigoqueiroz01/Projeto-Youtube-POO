package projetoyoutube;

public class YoutubeProject {
    public static void main(String[] args) {

        System.out.println("VIDEOS\n---------------------");
        Video video[] = new Video[3];

        video[0] = new Video("OOP Class 01");
        video[0].like();
        video[0].comment();
        video[0].share();
        System.out.println(video[0].toString());

        video[1] = new Video("JavaScript Class 10");
        video[1].deslike();
        video[1].comment();
        System.out.println(video[1].toString());

        video[2] = new Video("Algorithm Class 03");
        video[2].like();
        video[2].comment();
        video[2].share();
        System.out.println(video[2].toString());


        System.out.println("\nSTUDENTS\n---------------------");
        Student student[] = new Student[2];

        student[0] = new Student("Rodrigo", 23, "Masculine", "rodrigo01");
        System.out.println(student[0].toString() + "\n");

        student[1] = new Student("Juliana", 36, "Feminine", "juliana_");
        System.out.println(student[1].toString() + "\n");

        System.out.println("\nVIEWS\n---------------------");
        Visualization visualization[] = new Visualization[5];

        visualization[0] = new Visualization(student[0], video[0]);
        System.out.println(visualization[0].toString());
        visualization[0].evaluates();

        visualization[1] = new Visualization(student[0], video[1]);
        System.out.println(visualization[1].toString());
        visualization[1].evaluates(87.0);

        visualization[2] = new Visualization(student[0], video[2]);
        System.out.println(visualization[2].toString());
        visualization[2].evaluates(9);

        visualization[3] = new Visualization(student[1], video[2]);
        System.out.println(visualization[3].toString());
        visualization[3].evaluates(90.0);

        visualization[4] = new Visualization(student[1], video[0]);
        System.out.println(visualization[4].toString());
        visualization[4].evaluates(7);

    }
}
