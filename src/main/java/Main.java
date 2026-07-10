import static org.assertj.core.api.Assertions.assertThat;

public class Main {
    public static void main(String[] args) {
        String imie = "Marek";
        assertThat(imie).isEqualTo("Marek");
        System.out.println("Asercja przeszła!");
    }
}
