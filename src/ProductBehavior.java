import java.util.List;

public interface ProductBehavior<T> {
    public List<T> search();
    public List<T> sort();
}
