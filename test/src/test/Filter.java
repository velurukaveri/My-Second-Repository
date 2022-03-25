package test;

import java.util.ArrayList;
import java.util.List;

public class Filter {
	
	Emp s;
	public Emp get()
	{
		
		List<Emp> l=new ArrayList<Emp>();
		l.add(new Emp(2,"java","hyd"));
		l.add(new Emp(5,"c","hyd"));
		l.add(new Emp(6,"kl","hyd"));
		
		for(Emp e:l)
		{
			if(l.indexOf(e)==2)
			{
				//l.set(2, e.setId(102));
				e.setId(102);
				e.setName("kaveri");
				//System.out.print( e);
				s=e;
			}
			
			
		}

return s;
		
	}	
	

}
