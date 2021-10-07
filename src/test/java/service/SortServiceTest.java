package service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import logic.JavaSort;
import org.junit.jupiter.api.Test;

class SortServiceTest {

  private SortService sort = new SortService(new JavaSort<String>());

  @Test
  void test() {

   List<String> actual = sort.doSort(List.of("3", "2", "1"));

    assertEquals(List.of("1", "2", "3"), actual);

  }
}