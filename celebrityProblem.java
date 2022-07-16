public class Elements
{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
       {

        System.out.println("Enter the size of the Array:- ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                arr[j][k] = sc.nextInt();
            }
        }
        sc.close();
        Stack<Integer> obj = new Stack<>();
        
        for(int i =0;i<arr.length;i++)
        {
            obj.push(i);
        }
        
        while(obj.size()>=2)
        {
            int i=obj.pop();
            int j=obj.pop();
            
            if(arr[i][j]==0)
            {
                obj.push(i);
            }
            else
            {
                obj.push(j);
            }
        }
        int pos=obj.pop();
        for(int i=0;i<arr.length;i++)
        {
            if(i!=pos)
            {
                if(arr[i][pos]==0||arr[pos][i]==1)
                {
                    System.out.println("None");
                    return;
                }
            }
        }
        System.out.println("Celebrity :- "+pos);
    }
}
