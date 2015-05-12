import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class ConsecutivesTest {

    @Test
    public void testInclusiveRange() throws Exception {

        Integer[] out = Consecutives.inclusiveRange(3, 5).toArray(new Integer[0]);
        Integer[] tout = new Integer[]{3, 4, 5};
        assertArrayEquals(out, tout);

        out = Consecutives.inclusiveRange(5, 3).toArray(new Integer[0]);
        tout = new Integer[]{5, 4, 3};
        assertArrayEquals(out, tout);

        out = Consecutives.inclusiveRange(3, 3).toArray(new Integer[0]);
        tout = new Integer[]{3};
        assertArrayEquals(out, tout);
    }

    @Test
    public void testJoinList() throws Exception {
        Integer[] t1 = new Integer[]{0,1};
        String out = Consecutives.joinList(Arrays.asList(t1), "");
        String tout = "01";
        Assert.assertTrue(out.equals(tout));

        out = Consecutives.joinList(Arrays.asList(t1), " ");
        tout = "0 1";
        Assert.assertTrue(out.equals(tout));

        out = Consecutives.joinList(Arrays.asList(t1), "\t");
        tout = "0\t1";
        Assert.assertTrue(out.equals(tout));

        t1 = new Integer[]{0};
        out = Consecutives.joinList(Arrays.asList(t1), " ");
        tout = "0";
        Assert.assertTrue(out.equals(tout));
    }
}