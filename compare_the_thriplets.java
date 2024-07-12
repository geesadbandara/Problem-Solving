import java.util.*;
public class Solution{
    public static void main(String args[]){
        int[] a = new int[3];
        int[] b = new int[3];
        int[] result = {0,0};
        int x = 0;
        Scanner scan = new Scanner(System.in);
        
        while(x<3){
            
            a[x] = scan.nextInt();
            //System.out.println(a[x]);
            x++;
            
        }
        x = 0;
        while(x<3){
            
            b[x] = scan.nextInt();
            //System.out.println(b[x]);
            x++;
            
        }
        x = 0;
        while(x<3){
            if(a[x]>b[x]){
                result[0] = result[0] + 1;
                x++; 
                  
            }
            else if(a[x]<b[x]){
                
                result[1] = result[1] + 1;
                x++;
            }
            else{
                x++;
            }
            
        }
        System.out.print(result[0]+" "+result[1]);
        
        
    }
}
