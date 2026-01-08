package assighment_2week_3_Interface.Task18;
import java.util.ArrayList;
import java.util.List;


class RepkaStory {
    static void tell(List<Person> items) {
        Person first;
        Person second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i);
            second = items.get(i - 1);
            first.pull(second);
        }
    }
}
