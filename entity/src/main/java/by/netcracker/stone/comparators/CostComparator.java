package by.netcracker.stone.comparators;


import by.netcracker.stone.stone.Stone;

import java.util.Comparator;

/**
 * Created by valua on 10/8/2016.
 */
public class CostComparator implements Comparator<Stone> {
    @Override
        public int compare(Stone a, Stone b) {
            return (a.getPrice()*a.getCarat()) < (b.getPrice()*b.getCarat()) ?
                    -1 : a.getPrice()*a.getCarat() == b.getPrice()*b.getCarat() ? 0 : 1;
        }

}
