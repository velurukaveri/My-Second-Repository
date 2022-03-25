package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Employee> list=new ArrayList<Employee>();

list.add(new Employee(100,"shiva","manager",1000L,"2013-12-06",6000.6f,1200.36f,500));

list.add(new Employee(300,"nagarj","accountant",2000L,"2015-12-01",5000.15f,200.36f,200));

list.add(new Employee(500,"sandeep","office boy",2000L,"2010-05-12",5000.25f,200.36f,200));

list.add(new Employee(800,"muruga","manager",1000L,"2000-06-29",2000.336f,100.36f,100));

list.add(new Employee(200,"lakshman","sales",7000L,"1993-05-17",1700.220f,1500.36f,200));

list.add(new Employee(400,"ravi","manager",8000L,"1999-08-25",2200.620f,1000.36f,500));

//list.stream().filter(s->s.getDeptNO()==500).forEach(t->{t.getEmpNo();t.getEname();t.getJob();t.getHireDate();System.out.println(t);});

/*list.stream().filter(s->s.getSal()>5000).
map(t->{t.setComm(1000.6f);return t;}).
forEach(t->System.out.println(t));

List<Employee> emp=list.stream().map(s->{s.getMgr().intValue();return s;}).collect(Collectors.toList());
System.out.println(emp);
*/
Consumer<Employee> data =(l)->System.out.println(list);











}
}