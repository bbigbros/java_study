import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by stripes on 2016. 12. 24..
 */
public class StringCalculatorTest {
    private StringCalculator cal;

    @Before
    public void setup() {
        cal = new StringCalculator();
        System.out.println("Before Setup");
    }

    @After
    public void testEnd() {
        System.out.println("After ");
    }

    @Test
    public void add_null() {
        // null 과 빈 문자열에 관한 테스트
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));
    }

    @Test
    public void add_one_param() {
        assertEquals(3, cal.add("1,2"));
    }

    @Test
    public void add_delimiter() {
        assertEquals(6, cal.add("1,2,3"));
    }

    @Test
    public void add_delimiter_mix() {
        assertEquals(6, cal.add("1,2:3"));
    }

    @Test
    public void add_custom_mix_delimiter() {
        assertEquals(6, cal.add("//;\n1;2;3"));
    }

    @Test(expected = RuntimeException.class)
    public void add_negative() throws Exception {
        cal.add("-1,2,3");
    }

}
