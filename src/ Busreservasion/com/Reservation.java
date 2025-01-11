package Busreservasion.com;

import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the times of apply : ");
        int w = scanner.nextInt();
        Cab[] cabs = new Cab[w];
        Custamer[] custamers = new Custamer[w];
        Date[] dates = new Date[w];
        Date[] births = new Date[w];
        boolean booking = true;
        for (int x = 0; x < w; x++) {
            do {
                booking = false;
                System.out.println(" 1) Start booking ");
                System.out.println(" 2) exit booking");
                int user = scanner.nextInt();
                switch (user) {
                    case 1:
                        System.out.println(" Start booking ....... ");
                        break;
                    case 2:
                        System.out.println(" Exit booking ........ ");
                        booking = true;
                        break;
                    default: {
                        System.out.println("re-enter the number :");
                        booking = true;
                    }
                }
            } while (booking);
            System.out.print("enter the Customer name : ");
            String name = scanner.next();
            String empty = scanner.nextLine();
            int age;
            boolean flag = false;
            do {
                System.out.print("enter the Customer age : ");
                age = scanner.nextInt();
                if(age >= 18) {
                    age = age;
                    break;
                }
                else
                    flag = true;
            }while(true);
            System.out.print("enter the licence id : ");
            String licenceId = scanner.next();
             flag = true;
            Custamer custamer = null;
            do {
                flag = false;
                System.out.println("enter the gender : ");
                System.out.println("1) male :");
                System.out.println("2) female :");
                System.out.println("3) tranceGender :");
                int option = scanner.nextInt();
                int j = 0;
                switch (option) {
                    case 1:
                        custamer = new Custamer(name, licenceId, Gender.MALE, age);
                        break;
                    case 2:
                        custamer = new Custamer(name, licenceId, Gender.FEMALE, age);
                        break;
                    case 3:
                        custamer = new Custamer(name, licenceId, Gender.TRANCEGENDER, age);
                        break;
                    default:
                        System.out.println("re-enter the Gender :");
                        flag = true;
                }
            } while (flag);
            custamers[x] = custamer;
            int year ;
            flag = false;
            do {
               System.out.println("Enter your birth Year");
                year = scanner.nextInt();
                if(year <= 2005) {
                    year = year;
                    break;
                }
                else
                    flag = true;
            }while(true);
            System.out.println("Enter your Date Of Birth : ");
            Date birth = null;
            flag = true;
            do {
                flag = false;
                System.out.println("enter the date details :");
                System.out.println("1) JAN");
                System.out.println("2) FEB");
                System.out.println("3) MAR");
                System.out.println("4) APR");
                System.out.println("5) MAY");
                System.out.println("6) JUN");
                System.out.println("7) JUL");
                System.out.println("8) AUG");
                System.out.println("9) SEP");
                System.out.println("10) AUG");
                System.out.println("11) NAV");
                System.out.println("12) DEC");
                int choose = scanner.nextInt();
                System.out.print("enter the date : ");
                switch (choose) {
                    case 1:
                        System.out.println("enter the date 1 - 31");
                        int d = scanner.nextInt();

                        if (d >= 1 && d <= 31) {
                            birth = new Date(year, Month.JAN, d);
                            break;
                        }
                        else{
                            flag = true;
                            break;
                        }
                    case 2:
                        System.out.println("enter the date 1 - 29");
                        int e = scanner.nextInt();

                        if (e >= 1 && e <= 29) {
                           birth = new Date(year, Month.FEB, e);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 3:
                        System.out.println("enter the date 1 - 31");
                        int f = scanner.nextInt();

                        if (f >= 1 && f <= 31) {
                            birth = new Date(year, Month.MAR, f);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 4:
                        System.out.println("enter the date 1 - 30");
                        int g = scanner.nextInt();

                        if (g >= 1 && g <= 30) {
                           birth = new Date(year, Month.APR, g);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 5:
                        System.out.println("enter the date 1 - 31");
                        int h = scanner.nextInt();

                        if (h >= 1 && h <= 31) {
                            birth = new Date(year, Month.MAY, h);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 6:
                        System.out.println("enter the date 1 - 30");
                        int i = scanner.nextInt();

                        if (i >= 1 && i <= 30) {
                            birth = new Date(year, Month.JUN, i);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 7:
                        System.out.println("enter the date 1 - 31");
                        int j = scanner.nextInt();

                        if (j >= 1 && j <= 31) {
                            birth = new Date(year, Month.JUL, j);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 8:
                        System.out.println("enter the date 1 - 31");
                        int l = scanner.nextInt();

                        if (l >= 1 && l <= 31) {
                            birth = new Date(year, Month.AUG, l);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 9:
                        System.out.println("enter the date 1 - 30");
                        int m = scanner.nextInt();

                        if (m >= 1 && m <= 30) {
                            birth = new Date(year, Month.SEP, m);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 10:
                        System.out.println("enter the date 1 - 31");
                        int n = scanner.nextInt();

                        if (n >= 1 && n <= 31) {
                            birth = new Date(year, Month.OCT, n);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 11:
                        System.out.println("enter the date 1 - 30");
                        int o = scanner.nextInt();

                        if (o >= 1 && o <= 30) {
                            birth = new Date(year, Month.NAV, o);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 12:
                        System.out.println("enter the date 1 - 31");
                        int p = scanner.nextInt();

                        if (p >= 1 && p <= 31) {
                            birth = new Date(year, Month.DEC, p);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    default: {
                        System.out.println("re enter the date of birth :");
                        flag = true;
                    }
                }
            } while (flag);
            births[x] = birth;
            System.out.println("enter the CAB details :");
            Cab cab = null;
            flag = true;
            do {
                flag = false;
                System.out.println("1) TATA , TN72CE3452");
                System.out.println("2) HYUNDAI, TN65BH5579");
                System.out.println("3) MARUTHI, TN34KL9214");
                int choise = scanner.nextInt();
                switch (choise) {
                    case 1:
                        cab = new Cab(CabName.TATA, CabNo.TN72CE3452, 5,4500);
                        break;
                    case 2:
                        cab = new Cab(CabName.TOYOTA, CabNo.TN72CE3452, 8,6000);
                        break;
                    case 3:
                        cab = new Cab(CabName.MAHINDRA, CabNo.TN72CE3452, 7,7000);
                        break;
                    default: {
                        System.out.println("re-enter the Car details :");
                        flag = true;
                    }
                }

            } while (flag);
            cabs[x] = cab;
            Date date = null;
            flag = true;
            do {
                flag = false;
                System.out.println("enter the CAB required date :");
                System.out.println("1) JAN");
                System.out.println("2) FEB");
                System.out.println("3) MAR");
                System.out.println("4) APR");
                System.out.println("5) MAY");
                System.out.println("6) JUN");
                System.out.println("7) JUL");
                System.out.println("8) AUG");
                System.out.println("9) SEP");
                System.out.println("10) AUG");
                System.out.println("11) NAV");
                System.out.println("12) DEC");
                int choose = scanner.nextInt();
                System.out.print("enter the date : ");
                switch (choose) {
                    case 1:
                        System.out.println("enter the date 1 - 31");
                        int d = scanner.nextInt();

                        if (d >= 1 && d <= 31) {
                            date = new Date(2024, Month.JAN, d);
                            break;
                        }
                        else{
                            flag = true;
                            break;
                        }
                    case 2:
                        System.out.println("enter the date 1 - 29");
                        int e = scanner.nextInt();

                        if (e >= 1 && e <= 29) {
                            date = new Date(2024, Month.FEB, e);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 3:
                        System.out.println("enter the date 1 - 31");
                        int f = scanner.nextInt();

                        if (f >= 1 && f <= 31) {
                            date = new Date(2024, Month.MAR, f);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 4:
                        System.out.println("enter the date 1 - 30");
                        int g = scanner.nextInt();

                        if (g >= 1 && g <= 30) {
                            date = new Date(2024, Month.APR, g);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 5:
                        System.out.println("enter the date 1 - 31");
                        int h = scanner.nextInt();

                        if (h >= 1 && h <= 31) {
                            date = new Date(2024, Month.MAY, h);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 6:
                        System.out.println("enter the date 1 - 30");
                        int i = scanner.nextInt();

                        if (i >= 1 && i <= 30) {
                            date = new Date(2024, Month.JUN, i);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 7:
                        System.out.println("enter the date 1 - 31");
                        int j = scanner.nextInt();

                        if (j >= 1 && j <= 31) {
                            date = new Date(2024, Month.JUL, j);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 8:
                        System.out.println("enter the date 1 - 31");
                        int l = scanner.nextInt();

                        if (l >= 1 && l <= 31) {
                            date = new Date(2024, Month.AUG, l);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 9:
                        System.out.println("enter the date 1 - 30");
                        int m = scanner.nextInt();

                        if (m >= 1 && m <= 30) {
                            date = new Date(2024, Month.SEP, m);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 10:
                        System.out.println("enter the date 1 - 31");
                        int n = scanner.nextInt();

                        if (n >= 1 && n <= 31) {
                            date = new Date(2024, Month.OCT, n);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 11:
                        System.out.println("enter the date 1 - 30");
                        int o = scanner.nextInt();

                        if (o >= 1 && o <= 30) {
                            date = new Date(2024, Month.NAV, o);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    case 12:
                        System.out.println("enter the date 1 - 31");
                        int p = scanner.nextInt();

                        if (p >= 1 && p <= 31) {
                            date = new Date(2024, Month.DEC, p);
                            break;
                        }
                        else {
                            flag = true;
                            break;
                        }
                    default: {
                        System.out.println("enter the date are invalid :");
                        flag = true;
                    }
                }
            } while (flag);
            dates[x] = date;

            for (int i = 0; i < 1; i++) {
                System.out.println("-----------------Customer"+(i+1)+"--------------------");
                custamer = custamers[i];
                cab = cabs[i];
                date = dates[i];
                birth = births[i];
                System.out.println(custamer.getCustamer());
                System.out.println(birth.getBirth());
                System.out.println(cab.getCab());
                System.out.println(date.getDate());

            }
            System.out.println("booking is success");
            System.out.println("---------------------------------------");
        }
    }
}

