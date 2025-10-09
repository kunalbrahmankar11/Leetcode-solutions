package TwoPointer;

public class Container_with_most_water_12 {
    public static int MostWater(int height[]){
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left<=right){
           int width = right - left;
           int minHeight = Math.min(height[left],height[right]);
           int area = width * minHeight;
           maxArea = Math.max(area, maxArea);
           if(height[left]<height[right]){
            left++;
           }else{
            right--;
           }
        }
        return maxArea;

    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(MostWater(height));
    }
}
