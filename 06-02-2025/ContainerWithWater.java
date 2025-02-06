public class ContainerWithWater {
    public int maxArea(int[] height) {
        int i = 0; // start pointer
        int j = height.length - 1; // end pointer
        int ans = 0; // initialize to 0, because we're looking for maximum area
        
        while (i < j) {
            // Calculate the width and height of the container
            int w = (j - i) * Math.min(height[i], height[j]);

            // Update the maximum area found
            ans = Math.max(ans, w);

            // Move the pointers: the pointer pointing to the smaller height is moved
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        ContainerWithWater solution = new ContainerWithWater();

        // Test case 1
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max area: " + solution.maxArea(heights)); // Expected: 49

        // Test case 2
        int[] heights2 = {1, 1};
        System.out.println("Max area: " + solution.maxArea(heights2)); // Expected: 1

        // Test case 3
        int[] heights3 = {4, 3, 2, 1, 4};
        System.out.println("Max area: " + solution.maxArea(heights3)); // Expected: 16

        // Test case 4
        int[] heights4 = {1, 2, 1};
        System.out.println("Max area: " + solution.maxArea(heights4)); // Expected: 2
    }
}
