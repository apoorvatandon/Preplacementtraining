class PairSet  
{  
int first;  
int second;  
PairSet()   
{  
  
}  
PairSet(int m, int n)  
{  
first = m;  
second = n;  
}  
}  

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
public class TopViewExample1   
{  
BinaryTreeNode rt;  

public TopViewExample1() { rt = null; }  

public TreeMap<Integer, PairSet> mp = new TreeMap<>();  
 
public void fillMap(BinaryTreeNode rt, int d, int i)  
{  
if (rt == null)  
{  
return;  
}  
if (mp.get(d) == null)   
{  
mp.put(d, new PairSet(rt.v, i));  
}  
else if (mp.get(d).second > i)   
{  
mp.put(d, new PairSet(rt.v, i));  
}  
fillMap(rt.l, d - 1, i + 1);  
fillMap(rt.r, d + 1, i + 1);  
}  

public void topView(BinaryTreeNode rt)  
{  
fillMap(rt, 0, 0);  
for (Map.Entry<Integer, PairSet> en : mp.entrySet())   
{  
System.out.print(en.getValue().first + " ");  
}  
}
}
