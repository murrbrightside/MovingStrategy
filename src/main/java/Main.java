public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        character.setMoving(new Walking());
        character.setMoving(new Cycling());

    }
}
