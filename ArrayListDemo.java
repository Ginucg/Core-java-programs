

package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class emp {
	String ename;
	int eid;
	float sal;
	public emp(String ename, int eid, float sal) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
}
class empcomp implements Comparator<emp> {

	@Override
	public int compare(emp o1, emp o2) {
		
		return o1.getEid()-o2.getEid();
	}
	
}

public class ArrayListDemo {



	public static void main(String[] args) {
 ArrayList<emp> ob=new ArrayList<emp>();
 emp em=new emp("queen",01,4532f);
 emp em1=new emp("pallu",02,4032f);
 emp em2=new emp("sudha",02,5032f);
ob.add(em);
ob.add(em1);
ob.add(em2);

Iterator<emp> it= ob.iterator();
while(it.hasNext()){
emp eo=it.next();
System.out.println(eo.getEname()+" "+eo.getEid()+" "+eo.getSal());
 

	}

    Collections.sort(ob,new empcomp());
    Iterator<emp> it1= ob.iterator();

    System.out.println("after sort");
    while(it1.hasNext())
    {
    	emp eo=it1.next();
    	
    	System.out.println(eo.getEname()+" "+eo.getEid()+" "+eo.getSal());

    }
	}
}
