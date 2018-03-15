package FifoLifo;

import java.util.ArrayList;
import java.util.List;

public class FifoQueue implements MainInterface {
    List<Integer> number = new ArrayList<>();
    private int counter = 0;

    @Override
    public void putNumber(int a) {
        number.add(a);


    }

    @Override
    public int getNumber() {
        counter = counter +1;
        return number.get(counter-1);

    }
}
