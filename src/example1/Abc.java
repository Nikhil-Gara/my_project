package example1;
import java.util.ArrayList;
import java.util.List;


public class Abc {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		//System.out.print("hellow world");
		List<List> ls=new ArrayList<>();
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
		ls.add(new ArrayList<>(l));
		l.set(1, 1);
		l.set(2, 0);
		ls.add(new ArrayList<>(l));
		l.set(2, 1);
		ls.add(new ArrayList<>(l));
		ls.add(new ArrayList<>(l));
		//System.out.println(l);
		for(List<Integer> k:ls)
			System.out.println(k);
		l=null;
		System.gc();
		int i,j,n=ls.size();
		List<Integer> p=new ArrayList<>();
		List<Integer> q=new ArrayList<>();
		for(i=0;i<n;i++)
		{
			l=ls.get(i);
			for(j=0;j<n;j++)
			{
				if(l.get(j)==0)
				{
					p.add(i);
					q.add(j);
				}
			}
		}
		l=new ArrayList<Integer>(0);
		for(i=0;i<n;i++)
			l.add(0);
		//System.out.println(p);
		//System.out.println(q);
		for(Integer i1:p)
		{
			ls.set(i1,new ArrayList<Integer>(l));
		}
		for(Integer i2:q)
		{
			for(i=0;i<n;i++)
			{
				ls.get(i).set(i2, 0);
			}
		}
		System.out.println("*************");
		for(List<Integer> k:ls)
		System.out.println(k);
		
	
	}

}
