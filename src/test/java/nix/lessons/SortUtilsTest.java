package nix.lessons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.Random;

public class SortUtilsTest {

    private int[] testArray;

    @BeforeEach
    public void init(){
        testArray = new int[]{25, 8, 0, 25, -2};

    }

    @Test
    void testBubbleSortAlgorithm(){

        SortUtils sortUtil = new SortUtils();

        assertThat(sortUtil.bubbleSort(testArray)).isSorted();
    }
}
