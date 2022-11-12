import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Shark("Triton"), new Turtle("Lucky"), new Eagle("Eddy")};
        Shark[] sharks = new Shark[]{};
        Turtle[] turtles = new Turtle[]{};
        Eagle[] eagles = new Eagle[]{};
        for (Animal animal:animals) {
            if (animal instanceof Shark) {
                ((Shark) animal).attack();
            }else if (animal.getClass().equals(Turtle.class)) {
                ((Turtle) animal).swim();
            }else{
                ((Eagle) animal).fly();
            }
        }
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Shark){
                sharks = new Shark[]{(Shark) animals[i]};
            }else if(animals[i].getClass().equals(Turtle.class)){
                turtles = new Turtle[]{(Turtle) animals[i]};
            }else {
                eagles = new Eagle[]{(Eagle) animals[i]};
            }
        }
        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eagles));
    }

}