public class ByCar implements Moving{
    public void move(Character character) {
        character.setMoving(new ByCar());
    }
}
