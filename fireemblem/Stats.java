package fireemblem;

import java.util.HashMap;
import java.util.Map;

/**
 *  Generic class for representing stats.
 *
 *  This class can be used for current unit stats, class base stats, character
 *  stat modifiers, etc.
 */
public class Stats {
    private Map<Stat, Integer> stats = new HashMap<>();

    public Stats add(Stats otherStats) {
        Stats sum = new Stats();
        for (Stat stat : Stat.values()) {
            Integer thisValue = getStat(stat);
            Integer otherValue = getStat(stat);
            if (thisValue != null && otherValue != null) {
                sum.setStat(stat, thisValue + otherValue);
            }
        }
        return sum;
    }

    /**
     *  Adds the specified amount to all applicable stats.
     *
     *  Returns the result as a new Stats instance.
     */
    public Stats addToAllStats(int amountToAdd) {
        Stats sum = new Stats();
        for (Stat stat : Stat.values()) {
            Integer value = getStat(stat);
            if (value != null) {
                sum.setStat(stat, value + amountToAdd);
            }
        }
        return sum;
    }

    public Integer getStat(Stat stat) {
        return stats.get(stat);
    }

    public void setStat(Stat stat, int newValue) {
        stats.put(stat, newValue);
    }
}