
public class Pair<L, R> {
  public final L first;
  public final R second;

  private Pair(L first, R second) {
    this.first = first;
    this.second = second;
  }

  public static <L, R> Pair<L, R> of(L first, R second) {
    return new Pair<>(first, second);
  }

  @Override
  public String toString() {
    return "(" + first + ", " + second + ")";
  }
}
