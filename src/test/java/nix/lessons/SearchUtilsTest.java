package nix.lessons;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;

public class SearchUtilsTest {

    private static int[] testArray;
    private static int searchValue;
    private static SearchUtils searchUtil;

    @BeforeAll
    public static void init(){
        testArray = new int[]{-10, -6, 0, 5, 20};
        searchValue = 20;
        searchUtil = new SearchUtils();
    }

    @Test
    void shouldFindElement(){

        int index = 4;
        int bound = testArray.length-1;

        assertThat(searchUtil.binarySearch(testArray,searchValue, 0, bound)).isEqualTo(index);
    }

    @Test
    void shouldNotFindElement(){

        int returnedValue = -1;
        int bound = testArray.length-1;
        int[] unSortArray = {5,8,20,1,0};

        assertAll("not find element",
                () -> assertThat(searchUtil.binarySearch(testArray,searchValue+5, 0, bound)).isEqualTo(returnedValue),
                () -> assertThat(searchUtil.binarySearch(unSortArray,searchValue, 0, bound)).isEqualTo(returnedValue));


    }
}
