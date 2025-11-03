
class harshini {
private void mbbs() { //here we use the private keyword 
System.out.println("looking for a mbbs seat");
}
}
class ajith {
public static void main(String[] args) {
harshini m = new harshini();
m.mbbs(); //
}
}
>>>in this we use private keyword means only acess in same class(harshini)
  but we are trying to acess in different class(ajith) so thats wwhy we cant acess it
