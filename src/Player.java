import java.util.Random;
public abstract class Player {
    public Player(){
    }
    public Player(String name){
        setName(name);
    }
    private String name = "gracz domyślny";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z0-9~.]{3,}$")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nieprawidłowe imię.");
        }
    }
    public abstract int guess();
}

