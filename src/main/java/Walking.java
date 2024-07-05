public class Walking implements Moving {
    @Override
    public void move(Character character) {
        character.setMoving(new Walking());
    }
}