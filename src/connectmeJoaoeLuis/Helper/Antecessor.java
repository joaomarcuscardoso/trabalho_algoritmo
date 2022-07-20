package connectmeJoaoeLuis.Helper;

/**
 * Interface para estados que tem a funçaoo antecessores.
 *
 * @author  jomi
 * 
 */
public interface Antecessor {
    public <E extends Estado> java.util.List<E> antecessores();
}
