class Rep{
     String name;
    int age;
    String dept;
    int rollNo;
   // Mugavari mugavari;

    Rep(String n, int b,String c,int d){
        name = n;
        age = b;
        dept = c;
        rollNo = d;
        //mugavari = o;

    }
    public String getRep(){
        return "name"+": " +name+ "\nage"+ ": " + age+"\ndept"+": "+dept+"\nrollNo" +": "+ rollNo ;
    }
}
