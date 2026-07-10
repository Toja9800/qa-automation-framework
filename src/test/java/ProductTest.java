import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductTest {
    @Test
    void shouldReturnCorrectName() {
        Product product = new Product("Chleb", 4.50);
        String name = product.getName();
        assertThat(name).isEqualTo("Chleb");
    }

    @Test
    void shouldUpdatePriceWhenSetPriceCalled() {
        Product product = new Product("Chleb", 4.50);
        product.setPrice(5.50);
        assertThat(product.getPrice()).isEqualTo(5.50);
    }
}
