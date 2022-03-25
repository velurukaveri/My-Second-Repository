package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AllNew {
	
	
	public static void main(String[] args)
	{
		
		List<Emp> l=new ArrayList<Emp>();
		l.add(new Emp(2,"java","hyd"));
		l.add(new Emp(5,"c","hyd"));
		l.add(new Emp(6,"kl","hyd"));
		l.add(new Emp(6,"kl","hd"));
		l.add(new Emp(6,"ls","hyd"));
		l.add(new Emp(7,"kn","hydj"));
		l.add(new Emp(8,"kn","hy"));

		Predicate<Emp> emp=s->s.getName().startsWith("k");
		
		//Predicate<Emp> empo=r->r.getName().endsWith("n");
		
		Predicate<Emp> id=s->s.getId()==6;
		
		/*Predicate<Emp> slength=o->o.getPlace().length()==2;
		
		int empId=5;
		
		l.stream().
		filter(emp.and(empo)).
		forEach(System.out::println);
		
		l.stream().
		filter(emp.and(empo).and(id)).
		forEach(System.out::println);
		
		l.stream().
		filter(emp.and(empo).or(id)).
		forEach(System.out::println);*/
		
		/*l.stream().
		filter(id.negate().
				and(emp)
				).
		forEach(System.out::println);*/
		/*List<Emp> empList;
		
		Consumer<Emp> consumer=(s)->System.out.println(s);
		l.forEach(consumer);*/
		
		
		Consumer<Integer> intCon=(t)->System.out.println(t);
		
		intCon.accept(2000);
		
		
		Consumer<Emp> intCo=(t)->System.out.println(t.getName()+","+t.getPlace());
		
		l.forEach(intCo);
		
		
List<discount> colors=new ArrayList<discount>();

colors.add(new discount(2000));
colors.add(new discount(4000));
colors.add(new discount(5000));
colors.add(new discount(2000));


Map<Integer, String> values = new HashMap<>();
values.put(1, "One");
values.put(2, "Two");
values.put(3, "Three");

BiConsumer<Integer, String> con=(k,v)->System.out.println(k+""+v);
values.forEach(con);






		
	}

}
