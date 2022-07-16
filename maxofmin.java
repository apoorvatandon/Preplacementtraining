class MaxOfMin{
         
    static void printMaxOfMin(int a[], int n){ 
        
        for(int k=1; k<=n; k++){ 
            int maxOfMin = Integer.MIN_VALUE; 
       
            for(int i = 0; i <= n-k; i++){ 
                int min = a[i]; 
                
                for(int j = 1; j < k; j++){ 
                    if(a[i+j] < min){ 
                        min = a[i+j];
                    }
                } 
       
                if(min > maxOfMin){ 
                    maxOfMin = min; 
                }
            } 
       
            System.out.print(maxOfMin + " "); 
        } 
    } 
}
