class SortStack{ 
    
    public static Stack<Integer> sort(Stack<Integer> input){
        
        Stack<Integer> tmpStack = new Stack<Integer>(); 
        
        while(!input.isEmpty()){ 
            int tmp = input.pop(); 
          
            while(!tmpStack.isEmpty() && tmpStack.peek() > tmp){ 
                input.push(tmpStack.pop()); 
            } 
              
            tmpStack.push(tmp); 
        } 
        return tmpStack; 
    } 
