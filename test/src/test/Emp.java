package test;

public class Emp {
Integer id;
String name;
String place;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public Emp(Integer id, String name, String place) {
	super();
	this.id = id;
	this.name = name;
	this.place = place;
}
public Emp() {
	super();
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", place=" + place + "]";
}

}
