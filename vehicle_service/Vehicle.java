package vehicle_service;

import java.util.ArrayList;
import java.util.Scanner;



public class Vehicle {
    String regno;
    ArrayList<String> serviceslist = new ArrayList<>();
    ArrayList<Integer> rateslist = new ArrayList<>();

    static int Totalamount;
    static String servicechosen;
    static String type;

    public void getregno()
    {
        System.out.println("yyy");

    }

    public  Vehicle()
    {
        regno="MH45U9876";
        serviceslist.add("Engine");
        serviceslist.add("Brake");
        serviceslist.add("Oil Test");
        serviceslist.add("Suspension Test");
        serviceslist.add("Electricals");
    }
    public void services()
    {
        serviceslist.add("Engine");
        serviceslist.add("Brake");

        serviceslist.add("Oil Test");
        serviceslist.add("Suspension Test");
        serviceslist.add("Electricals");
    }

    public void get_started()
    {
      int choice;

        String slashh="//////////////////////////////////////////////////////////////////////";
        String dashhh="----------------------------------------------------------------------";

      Scanner sc = new Scanner(System.in);
        System.out.println(slashh);
      System.out.println("Welcome to our Vehicle Service Management");
        System.out.println(dashhh);
      System.out.print("Select type of vehicle:" +
              " 1:Two_wheeler\t " +
              "2.Four-Wheeler\n");
        System.out.println(slashh);
      choice=sc.nextInt();
      if(choice==1)
      {
          Two_wheeler v1=new Two_wheeler();
          v1.services();
          v1.rates();
          type="Two-Wheeler";
          System.out.println("Choose which service you want");
          v1.printservices();
          System.out.print("");
          int ch= sc.nextInt();
          if(ch==1)
          {
            servicechosen=v1.serviceslist.get(0);
            Totalamount=v1.rateslist.get(0);
          }
          if(ch==2)
          {
              servicechosen=v1.serviceslist.get(1);
              Totalamount=v1.rateslist.get(1);
          }
          if(ch==3)
          {
              servicechosen=v1.serviceslist.get(2);
              Totalamount=v1.rateslist.get(2);
          }
          if(ch==4)
          {
              servicechosen=v1.serviceslist.get(3);
              Totalamount=v1.rateslist.get(3);
          }
          if(ch==5)
          {
              servicechosen=v1.serviceslist.get(4);
              Totalamount=v1.rateslist.get(4);
          }

      }
        if(choice==2)
        {
            Four_wheeler v1=new Four_wheeler();
            v1.services();
            v1.rates();
            type="Four-Wheeler";
            System.out.println("Choose which service you want");
            v1.printservices();
            System.out.print("");
            int ch= sc.nextInt();
            if(ch==1)
            {
                servicechosen=v1.serviceslist.get(0);
                Totalamount=v1.rateslist.get(0);
            }
            if(ch==2)
            {
                servicechosen=v1.serviceslist.get(1);
                Totalamount=v1.rateslist.get(1);
            }
            if(ch==3)
            {
                servicechosen=v1.serviceslist.get(2);
                Totalamount=v1.rateslist.get(2);
            }
            if(ch==4)
            {
                servicechosen=v1.serviceslist.get(3);
                Totalamount=v1.rateslist.get(3);
            }
            if(ch==5)
            {
                servicechosen=v1.serviceslist.get(4);
                Totalamount=v1.rateslist.get(4);
            }

        }

    }
}

class Two_wheeler extends Vehicle{

    public void services()
    {
        serviceslist.clear();
        serviceslist.add("Bike Engine");
        serviceslist.add("Bike Brake");
        serviceslist.add("Bike Oil Test");
        serviceslist.add("Bike Suspension Test");
        serviceslist.add("Bike Electricals Test");
    }
    public void printservices()
    {
       for(int a=0;a< serviceslist.size();a++)
       {
           System.out.println(a+1+":\t"+serviceslist.get(a));
       }
    }


    public void rates() {
        rateslist.add(250);
        rateslist.add(200);
        rateslist.add(300);
        rateslist.add(380);
        rateslist.add(400);
    }

}

class Four_wheeler extends Vehicle{
    public void services()
    {   serviceslist.clear();
        serviceslist.add("Car Engine");
        serviceslist.add("Car Brake");
        serviceslist.add("Car Oil Test");
        serviceslist.add("Car Suspension Test");
        serviceslist.add("Car Electricals Test");
    }

    public void printservices()
    {
        for(int a=0;a< serviceslist.size();a++)
        {
            System.out.println(a+1+":\t"+serviceslist.get(a));
        }
    }

    public void rates() {
        rateslist.add(500);
        rateslist.add(400);
        rateslist.add(600);
        rateslist.add(400);
        rateslist.add(900);
    }

}



