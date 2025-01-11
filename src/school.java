public class school {
    public static void main(String args[]) {

        //Address address1 = new Address(1,"south Street" , "kadaloore","viruthacahlam",627234);
        //Address address2 = new Address(2,"north Street" ," koodaloore","Thoothukudi",627110);
        //Address address3 = new Address(132,"west Street" ,"thiruvanmeeyur" , "chennai",600028);
        //Address address4 = new Address(31,"kovil Street" , "kamarajar kalani","Thirumalai",611045);
       // Address address5 = new Address(54,"east Street" , "vattaputhur" ,"kanniya kumari",629105);
        //Address address6 = new Address(7,"Netheji Street","sripuram" ,"vellore",627302);
       // Address address7 = new Address(45,"north Street" , "anna nagar","chennai",600002);
        //Address address8 = new Address(28,"velu Street ", "maraimalai","Tiruppur",615331);
       // Address address9 = new Address(13,"raiway Street" , "johncy nagar","Tiruppathur",630028);
        //Address address10 = new Address(134,"north Street" , "Athichaperi","Tirunelveli",627502);

        Student []students = new Student[10];

        //Student student1 = new Student("raju",12,5, new Address(1,"south Street" , "kadaloore","viruthacahlam",627234));

        students[0] = new Student("raju",12,5, new Address(1,"south Street" , "kadaloore","viruthacahlam",627234));

        //Student student2 = new Student("ram",10,4, new Address(2,"north Street" ," koodaloore","Thoothukudi",627110));
        students[1] = new Student("ram",10,4, new Address(2,"north Street" ," koodaloore","Thoothukudi",627110));

        //Student student3 = new Student("ash",53,3, new Address(132,"west Street" ,"thiruvanmeeyur" , "chennai",600028));
        students[2] = new Student("ash",53,3, new Address(132,"west Street" ,"thiruvanmeeyur" , "chennai",600028));

        //Student student4 = new Student("pikachu",23,2, new Address(31,"kovil Street" , "kamarajar kalani","Thirumalai",611045));
        students[3] = new Student("pikachu",23,2, new Address(31,"kovil Street" , "kamarajar kalani","Thirumalai",611045));

        Student student5 = new Student("ton",6,6, new Address(54,"east Street" , "vattaputhur" ,"kanniya kumari",629105));
        students[4] = student5;

        Student student6 = new Student("sachin",10,10, new Address(7,"Netheji Street","sripuram" ,"vellore",627302));
        students[5] = student6;

        Student student7 = new Student("brock",8,7, new Address(45,"north Street" , "anna nagar","chennai",600002));
        students[6] = student7;

        Student student8 = new Student("ken",32,4,  new Address(28,"velu Street ", "maraimalai","Tiruppur",615331));
        students[7] = student8;

        Student student9 = new Student("cena",3,11, new Address(13,"raiway Street" , "johncy nagar","Tiruppathur",630028));
        students[8] = student9;

        Student student10 = new Student("john",28,5, new Address(134,"north Street" , "Athichaperi","Tirunelveli",627502));
        students[9] = student10;


        for (int i = 0; i < students.length; ++i) {
            Student student = students[i];
            Address address = student.address;
            System.out.println("------------------Student: " + (i + 1) + "------------------------");
            System.out.println(student.getDetails());
            System.out.println(address.getAddress());
            System.out.println("-----------------------------------------------------------------\n\n\n");
        }
    }
}


class Student{
    String name;
    int id;
    int std;
    Address address;
    public Student(String n,int a,int s, Address ad){
        name = n;
        id = a;
        std = s;
        address = ad;

    }

    public String getDetails() {
        return "id: " + id + "; name: "  + name + "; std: " + std;
        //return details;
    }
}

class Address{
    int no;
    String Street;
    String city;
    String dist;
    long pin;
    Address(int a,String b, String c, String d, long e ){
        no =  a;
        Street = b ;
        city = c ;
        dist = d ;
        pin =  e;
    }

    public String getAddress() {

        return "Door No: " + no + "; street: " + Street + "; city: " + city + "; dist: " + dist + "; pin: " + pin;
        //return address;

    }
}

