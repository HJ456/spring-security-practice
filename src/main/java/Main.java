import config.Config;
import java.util.Arrays;
import logic.BubbleSort;
import logic.JavaSort;
import logic.Sort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.SortService;

public class Main {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    SortService sortService = context.getBean(SortService.class);

    System.out.println("{result " + sortService.doSort(Arrays.asList(args)));
  }

}
