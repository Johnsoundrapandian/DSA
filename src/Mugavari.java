 class Mugavari {
     int doorNo;
     String area;
     String locality;
     String mavattam;
     long code;
     Mugavari(int f , String g, String h,String i,long j){
          doorNo = f;
          area = g;
          locality = h;
          mavattam = i;
          code = j;
     }
     public String getMugavari(){
          return "doorNo" +": "+doorNo+"\narea" +": "+area+"\nlocality" +": "+locality+ "\nmavattam"+":" +mavattam+"\ncode :"+code;
     }
}
