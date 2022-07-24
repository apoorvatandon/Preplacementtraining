class BTNode   
{  
int val;  
BTNode lt, rt;  
public BTNode(int j)  
{  
val = j;  
rt = null;  
lt = null;  
}  
}  
public class LeftViewExample   
{  
BTNode r;  
int maxLevel = 0;
public void leftViewUtility(BTNode nde, int lvl)  
{  

if (nde == null)  
{  
return;  
}  

if (maxLevel < lvl)   
{  

System.out.print(nde.val + " ");  
maxLevel = lvl;  
}  

leftViewUtility(nde.lt, lvl + 1);  

leftViewUtility(nde.rt, lvl + 1);  
}  

public void leftView()  
{  
leftViewUtility(r, 1);  
}  
}
