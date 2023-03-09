package second;

import java.util.Objects;

public class Result {
    public int distance;
    public String path;

    public Result(int distance, String path) {
        this.distance = distance != Integer.MAX_VALUE / 2 ? distance : -1;
        this.path = distance != Integer.MAX_VALUE / 2 ? path : "NO PATH";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return distance == result.distance && Objects.equals(path, result.path);
    }
}
