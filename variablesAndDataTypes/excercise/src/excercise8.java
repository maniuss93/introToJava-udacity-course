/* Your friend seems to be really good at music,
he managed to score 96% on his final exam!
Now that you know all 5 subject grades,
update the average calculation below to calculate the
total average of all subjects. */

public class excercise8 {
    public static void main(String [] args) {

        double maths=97.5;
        double english=98;
        double science=83.5;
        double drama=75;
        double music=96;
        double sum=maths+english+science+drama+music;
        double average=sum/5;
        System.out.println(average);
    }
}
