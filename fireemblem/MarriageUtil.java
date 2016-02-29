package fireemblem;

public class MarriageUtil {
    // TODO: add character check for avatar marrying child character
    public static Stats generateOffspringMaxStatModifiers(
        Stat firstParentMaxStatModifiers,
        Stat secondParentMaxStatModifiers) {
        return firstParentMaxStatModifiers
            .add(secondParentMaxStatModifiers)
            .addToAllStats(1);
    }
}