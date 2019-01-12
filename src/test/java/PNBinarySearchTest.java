import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PNBinarySearchTest {

    private PNBinarySearch<Integer> pnBinarySearch;
    private Integer[] array = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Before
    public void referesh() {
        this.pnBinarySearch = new PNBinarySearch<Integer>(array, 9);
    }

    @Test
    public void search() throws Exception {
        assertTrue(pnBinarySearch.search());
    }

}