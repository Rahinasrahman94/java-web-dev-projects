package org.launchcode;
import org.launchcode.Flavor;
import java.util.Comparator;

public class FlavorComparator  implements Comparator<Flavor> {
    @Override
    public int compare(Flavor f1, Flavor f2) {
        return f1.getAllergens().size() - (f2.getAllergens().size());
      //  return flavor1.getName().compareTo(flavor2.getName());

    }
}
