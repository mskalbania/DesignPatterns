public class CircleAdapter implements Shape{

    private Circle circle = new Circle();

    @Override
    public void draw() {
        circle.drawCircle();
    }
}
