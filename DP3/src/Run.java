import java.util.HashSet;
import java.util.Set;

//SIMPLE EXAMPLE OF ADAPTER CLASS

public class Run {

    public static void main(String[] args) {
        //CIRCLE IS NOW ADAPTED SO IT CAN BE PUT IN SHAPE SET
        Set<Shape> shapes = new HashSet<>();
        shapes.add(new CircleAdapter());
        shapes.add(new Rectangle());
        shapes.add(new Square());
        //WE CAN ALSO CALL DRAW METHOD ON IT
        shapes.forEach(Shape::draw);
    }
}
