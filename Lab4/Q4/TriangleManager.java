
package Q4;

import Q3.Triangle;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class TriangleManager {

    private List<Triangle> triangles;

    public TriangleManager(boolean useArrayList) {
        if (useArrayList) {
            triangles = new ArrayList<>();
        } else {
            triangles = new LinkedList<>();
        }
    }

    public void addTriangle(Triangle t) {
        if (t == null) {
            throw new IllegalArgumentException("Triangle cannot be null");
        }
        triangles.add(t);
    }

    public Triangle findTriangleWithLargestPerimeter() {
        Triangle largest = null;

        for (Triangle t : triangles) {
            if (largest == null ||
                    t.getPerimeter() > largest.getPerimeter()) {
                largest = t;
            }
        }

        return largest;
    }
}
