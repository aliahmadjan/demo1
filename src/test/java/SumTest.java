import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SumTest {
    @Test
    public void sumtest1()
    {
        Sum s = new Sum();

        assertEquals(s.addition(1, 2),3);
    }
}
