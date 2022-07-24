class BinaryTreeNode   
{  
int v;  

BinaryTreeNode l, r;  
public BinaryTreeNode(int i)  
{  
v = i;  
r = null;  
l = null;  
}  
}  
public class BottomViewExample1  
{  
public void displayBottomViewUtil(BinaryTreeNode rt, int current, int horDis, TreeMap<Integer, int[]> mp)  
{  
if (rt == null)  
{  
return;  
}  
 
if (!mp.containsKey(horDis))  
{  
mp.put(horDis, new int[]{ rt.v, current });  
}  
else  
{  
int[] p = mp.get(horDis);  
if (p[1] <= current)  
{  
p[1] = current;  
p[0] = rt.v;  
}  
mp.put(horDis, p);  
}  
displayBottomViewUtil(rt.l, current + 1, horDis - 1, mp);  
displayBottomViewUtil(rt.r, current + 1, horDis + 1, mp);  
}  
public void displayBottomView(BinaryTreeNode rt)  
{  
TreeMap<Integer, int[]> mp = new TreeMap<>();  
displayBottomViewUtil(rt, 0, 0, mp);  
for(int value[] : mp.values())  
{  
System.out.print(value[0] + " ");  
}  
}  
}
