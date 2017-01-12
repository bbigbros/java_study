import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by stripes on 2016. 12. 25..
 */

public class SplitTest {
    @Test
    public void split() {
        assertArrayEquals(new String[] {"1"}, "1".split(","));
        assertArrayEquals(new String[] {"1", "2"}, "1,2".split(","));

    }
}
