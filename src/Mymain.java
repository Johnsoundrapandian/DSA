public class Mymain {
    public static void main(String args[]){
      //  String a  =  " john ";
        String a = new String("john");
        String b = new String("john");
        Mystring obj = new Mystring(a,b);
        boolean j =obj.getEqual();
        System.out.println(j);

    }
}
class Mystring {
    String m;
    String n;

    Mystring(String a, String b) {
        m = a;
        n = b;
    }

   // int a = 0;
    //int b = 0;

    public boolean getEqual() {
        int a = m.length();
        /*for(int i = 0; true; i++)
        {
            if(m.charAt(i) != ' ' ){
                a += 1;
            }
            else
                break;
        }*/
        int b = n.length();
       /* for(int i = 0; true; i++)
        {
            if(n.charAt(i) != '\0'){
                b += 1;
            }
            else
                break;
        }*/
        int flag = 0;
        if (a == b)
        {
            for (int i = 0; i < b; i++)
            {
                if (m.charAt(i) == n.charAt(i))
                {
                    flag = 1;
                }
                else
                    flag = 0;
                break;
            }
            if (flag == 1) {
                return true;
            }
            else
                return false;
        }
        else
            return false;

        }
}