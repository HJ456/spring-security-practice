package logic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

  @DisplayName("버블소트 - 리스트 넣으면 정렬된 결과")
  @Test
  void given_List_WhenExcuting_ThenReturn() {
    BubbleSort<Integer> bubbleSort = new BubbleSort<>();

    List<Integer> actual = bubbleSort.sort(List.of(2, 3, 4, 5, 1 ));

    assertEquals(List.of(1,2,3,4,5), actual);

  }
}