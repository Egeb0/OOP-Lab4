
package Q4;

import Q3.Triangle;
import Q3.EquilateralTriangle;
import Q3.RightTriangle;

public class TriangleManagerTest {
    public static void main(String[] args) {

        // Test ArrayList
        TriangleManager manager1 = new TriangleManager(true);

        manager1.addTriangle(new EquilateralTriangle(5));
        manager1.addTriangle(new RightTriangle(3, 4, 5));
        manager1.addTriangle(new EquilateralTriangle(10));

        Triangle largest1 = manager1.findTriangleWithLargestPerimeter();

        System.out.println("ArrayList Test");
        System.out.println("Largest Perimeter: " + largest1.getPerimeter());

        // Test LinkedList
        TriangleManager manager2 = new TriangleManager(false);

        manager2.addTriangle(new RightTriangle(5, 12, 13));
        manager2.addTriangle(new EquilateralTriangle(4));

        Triangle largest2 = manager2.findTriangleWithLargestPerimeter();

        System.out.println("LinkedList Test");
        System.out.println("Largest Perimeter: " + largest2.getPerimeter());

        // Test exception
        try {
            manager1.addTriangle(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
