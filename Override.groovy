class Person{
private String name;
private int age;
private String gender ;
private String address;

Person(String s,int a,String g,String ad){
this.name = s;
this.age = a;
this.gender = g;
this.address = ad;
}
String getName(){
return this.name;
}
int getAge(){
return this.age;
}
String getGender(){
return this.gender;
}
String getAddress(){
return this.address;
}

String toString(){
return "${name} is man whose agr is ${age} and lives in ${address} with empId as 12 draws a 12344 money "; 
}
}
Person p = new Person("Amit",24,"M","ajfhkjafh");
p.toString();

//class Employee extends Person{
//private int empId;
//private String company;
//private double salary;
//
//Employee(int e,String c,double s){
//this.empId = e;
//this.c = company;
//this.s = salary;
//}
//int getemp(){
//return this.empId;
//}
//int getcompany(){
//return this.company;
//}
//int getsal(){
//return this.salary;
//}
//}
//def e = new Employee(1811926,"TCS",3.36);
//println e.getemp();
//println e.getcompany();
//println e.getsal();