public class Cycling implements Moving {
    public void move(Character character) {
        character.setMoving(new Cycling());
    }
}
