package vehicle_service;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


public class mains {

    static int i = 0;
    static user[] user = null;
    static int Total=0;
    static String service;
    static  String Vehicle_type;
    public static String centerString (int width, String s) {
        return String.format("%-" + width  + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
    }
    public void print_invoice()
    {
            // String line3_l="";
            //String line3_r=a+"|";
            String slashh="**********************************************************************";
            String dashhh="----------------------------------------------------------------------";
            String str_title=centerString(70,"CAR SERVICING AAJ AUR KAL!!");
            String str_line3_l= String.format("%"+(-70)+"s","INVOICE NO.");
            String str_line4_l= String.format("%"+(-70)+"s","REGISTER NO.");
            String str_line5_l= String.format("%"+(-70)+"s","USERNAME");
            String str_line6_l= String.format("%"+(-70)+"s","PHONE NO.");
           // String str_line7_l= String.format("%"+(-70)+"s","|VEHICLE TYPE");
            String str_line8_l= String.format("%"+(-70)+"s","SERVICE TYPE");
            String str_line9_l= String.format("%"+(-70)+"s","SERVICE CHARGE");

            //String str_line3_r=String.format("%"+(-70)+"s","|"+a);

            String strl3=str_line3_l+(1000*Math.random());
            String strl4=str_line4_l+7;
            String strl5=str_line5_l+user[i].username;
            String strl6=str_line6_l+user[i].phoneno;
            //String strl7=str_line7_l+user[i].username;
            String strl8=str_line8_l+service;
            String strl9=str_line9_l+Total;

            //System.out.println(String.format("%"+(70)+"s",strl3));
            System.out.println(slashh);
            System.out.println(str_title);
            System.out.println(slashh);
            System.out.println(String.format("%"+(70)+"s",strl3));
            System.out.println(String.format("%"+(70)+"s",strl4));
            System.out.println(String.format("%"+(70)+"s",strl5));
            System.out.println(String.format("%"+(70)+"s",strl6));
            //System.out.println(String.format("%"+(70)+"s",strl7));
            System.out.println(String.format("%"+(70)+"s",strl8 ));
            System.out.println(dashhh);
            System.out.println(String.format("%"+(70)+"s",strl9));
            System.out.println(dashhh);

        }




    public static void main(String[] args) throws IOException {
        System.out.println("\t\t\t*******************************************************************");
        System.out.println("\t\t\t\t\t\t\tW E L C O M E  T O   A U T O - G A R A G E");
        System.out.println("\t\t\t--------------------------------------------------------------------");
        Scanner scc = new Scanner(System.in);

        user = new user[100];

        char choice = 'u';
        int ch = 0;
        String username;
        String password;
        String address;
        String phno;
        do {
            System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////");
            System.out.println("\t\t1.Create Account\t2.Start with Service\t3.Get Receipt\t4..Display user details");
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            ch = scc.nextInt();
            switch (ch) {
                case 1:
                    try {
                        FileWriter fw = new FileWriter("users.txt", true);
                        user[i] = new user();
                        user[i].getuserinflo();
                        username = user[i].username;
                        password = user[i].password;
                        address = user[i].address;
                        phno = user[i].phoneno;
                        fw.write(username);
                        fw.write("\t");
                        fw.write(password);
                        fw.write("\t");
                        fw.write(address);
                        fw.write("\t");
                        fw.write(phno);
                        fw.write("\n");
                        fw.close();

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 2:
                    Vehicle v = new Vehicle();
                    v.get_started();
                    Total = v.Totalamount;
                    service = v.servicechosen;
                    Vehicle_type=v.type;

                case 3: mains m = new mains();
                        if(user[i]!=null) {
                            if(Total==0){
                                System.out.println("Please Take a service for Invoice");
                            }
                            else
                            {
                              m.print_invoice();
                            }

                        }
                        else
                        {
                         System.out.println("Please Create Account first");
                        }
                        break;

                case 4:
                    String str = Files.readString(Path.of("users.txt"));
                    System.out.println(str);
                    break;

            }
            System.out.println("Do you want to continue ?");
            choice = scc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

    }
}


