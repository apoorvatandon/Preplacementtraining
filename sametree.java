public class SameTree {
 
   public static boolean isSame(TreeNode p, TreeNode q) {
       if(p == null && q == null) {
           return true;
 
       } else if(p == null || q == null) {
           return false;
 
       }

       Queue<TreeNode> qu1 = new LinkedList<>();
       Queue<TreeNode> qu2 = new LinkedList<>();
 
       qu1.add(p);
       qu2.add(q);
 
      while(!qu1.isEmpty() && !qu2.isEmpty()) {
 
          TreeNode temp1 = qu1.poll();
          TreeNode temp2 = qu2.poll();

         if(temp1.data != temp2.data) {
             return false
         }

         if(temp1.left != null && temp2.left != null) {
              qu1.add(temp1.left)
              qu2.add(temp2.left);
 
          } else if(temp1.left != null || temp2.left != null) {
               return false;
 
           }

           if(temp1.right != null && temp2.right != null) {
                 qu1.add(temp1.right);
                 qu2.add(temp2.right);
 
           } else if(temp1.right != null || temp2.right != null){
                  return false;
 
            } 
 
        }
 
        return true;
   }
}
