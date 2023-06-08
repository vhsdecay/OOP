package HW.lesson3.task_2;

import java.util.Iterator;

public class Market extends Product{

    @Override
    public Iterator<Note> iterator() {

        Iterator<Note> iter = new Iterator<Note>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < products.size();
            }

            @Override
            public Note next() {
                return products.get(index++);
            }
        };
        return iter;
    }

}
 