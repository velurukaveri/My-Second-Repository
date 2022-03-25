package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Emp> l=new ArrayList<Emp>();
		l.add(new Emp(2,"java","hyd"));
		l.add(new Emp(5,"c","hyd"));
		l.add(new Emp(6,"kl","hyd"));
		int i;
		
		Filter f=new Filter();
		System.out.println(f.get());
		 
	/*	for(Emp e:l)
		{
			if(l.indexOf(e)==2)
			{
				//l.set(2, e.setId(102));
				e.setId(102);
				e.setName("kaveri");
				System.out.print( e);
			}
			
			//System.out.print( e);
		}*/
		
	
//Stream<Emp> e=l.stream().filter(Emp->l.indexOf(Emp)==2);
//e.forEach(Emp->System.out.println(Emp));
		
//l.stream().filter(Emp->l.indexOf(Emp)==2).forEach((u)->{u.setId(108);
                                                //  u.setName("jyothi");});
//l.stream().filter(Emp->l.indexOf(Emp)==2).forEach((u)->{u.setId(103);
//u.setName("jyothi");}).forEach(s->System.out.println(s));


/*l.stream().filter(Emp->l.indexOf(Emp)==2).forEach((u)->{u.setId(108);
u.setName("jyothi");System.out.println(u);});*/
//l.stream().forEach(s->System.out.println(s));

	}

}
