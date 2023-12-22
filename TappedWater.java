public class TappedWater {
    public static int Tapped_Water(int height[]){
        int n=height.length;
        int left_max[]=new int[n];
        left_max[0]=height[0];
        for(int i=1;i<n;i++){
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }
        int right_max[]=new int[n];
        right_max[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right_max[i]=Math.max(height[i], right_max[i+1]);
        }
        int tap_water=0;
         for(int i=0;i<n;i++){
            int water_level=Math.min(left_max[i], right_max[i]);
            int tap_water1=water_level-height[i];
            System.out.print(tap_water1);
            tap_water=tap_water+tap_water1;
            System.out.print("This is total water till now"+tap_water);
            System.out.println();
            
         }
        
         return tap_water;

    }
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(Tapped_Water(arr));
    }
}
