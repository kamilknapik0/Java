public class PioGame {
    public static void main(String[] args) {
        //gra w odgadywanie liczby z kostki
        Game game = new Game();

        game.addPlayer(new PlayerComp("Janusz"));
        game.addPlayer(new PlayerComp("Michal"));
        game.addPlayer(new PlayerComp("Bartek"));

        game.printPlayers();
        game.play();
    }
}
