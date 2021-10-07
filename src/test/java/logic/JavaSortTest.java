package logic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class JavaSortTest {
  @DisplayName("자바 소트")
  @Test
  void given_List() {
    JavaSort<Integer> javaSort = new JavaSort<>();

    List<Integer> actual = javaSort.sort(List.of(2, 3, 4, 5, 1 ));

    assertEquals(List.of(1,2,3,4,5), actual);

  }
}