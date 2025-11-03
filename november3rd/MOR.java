class kotireddy {
public void name() {
System.out.println("he is a farmer");
}
}
class ajith extends kotireddy{
public void name() {
super.name();
System.out.println("looking for a job");
}
}
class mor {
public static void main(String[] args) {
ajith m = new ajith();
m.name();
}
} 


ajith modifies the behaviour of same method in koti reddy is called method over riding 
  to overcome the method overriding we use super keyword
