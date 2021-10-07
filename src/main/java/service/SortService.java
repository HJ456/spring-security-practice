package service;

import java.util.List;
import logic.JavaSort;
import logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public class SortService {

  private final Sort<String> sort;

  public SortService(@Qualifier("BubbleSort") Sort<String> sort)
  {
    this.sort = sort;
  }

  public List<String> doSort(List<String> list){
    return sort.sort(list);
  }

}
