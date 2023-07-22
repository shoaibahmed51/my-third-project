import java.util.Scanner;
import java.text.DecimalFormat;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");
        int code;
        double rupee, dollar, pound, euro, yen, riyal, dinar;
        System.out.println("Select the currency you want to convert");
        System.out.println("1. Rupee");
        System.out.println("2. Dollar");
        System.out.println("3. Pound");
        System.out.println("4. Euro");
        System.out.println("5. Yen");
        System.out.println("6. Riyal");
        System.out.println("7. Dinar");
        System.out.println("Enter your choice");
        code = sc.nextInt();
        //For Rupee Conversion
        if (code == 1)
        {
            System.out.println("Enter amount in rupees");
            rupee = sc.nextFloat();
            dollar = rupee / 75.99;
            System.out.println("Dollar : "+f.format(dollar));
            pound = rupee / 98.15;
            System.out.println("Pound : "+f.format(pound));
            euro = rupee / 85.05;
            System.out.println("Euro : "+f.format(euro));
            yen = rupee / 0.61;
            System.out.println("Yen : "+f.format(yen));
            riyal = rupee / 18.93;
            System.out.println("Riyal : "+f.format(riyal));
            dinar = rupee / 2.03;
            System.out.println("Dinar : "+f.format(dinar));
        }
        //For Dollar Conversion
        else if (code == 2)
        {
            System.out.println("Enter amount in dollar");
            dollar = sc.nextFloat();
            rupee = dollar * 75.99;
            System.out.println("Rupees : "+f.format(rupee));
            pound = dollar * 0.86;
            System.out.println("Pound : "+f.format(pound));
            euro = dollar * 0.93;
            System.out.println("Euro : "+f.format(euro));
            yen = dollar * 121.65;
            System.out.println("Yen : "+f.format(yen));
            riyal = dollar * 3.21;
            System.out.println("Riyal : "+f.format(riyal));
            dinar = dollar * 0.32;
            System.out.println("Dinar : "+f.format(dinar));
        }
        //For Pound Conversion
        else if(code == 3)
        {
            System.out.println("Enter amount in pound");
            pound = sc.nextFloat();
            rupee = pound * 98.15;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = pound * 1.14;
            System.out.println("Dollar : "+f.format(dollar));
            euro = pound * 0.81;
            System.out.println("Euro : "+f.format(euro));
            yen = pound * 208.00;
            System.out.println("Yen : "+f.format(yen));
            riyal = pound * 3.91;
            System.out.println("Riyal : "+f.format(riyal));
            dinar = pound * 0.41;
            System.out.println("Dinar : "+f.format(dinar));
        }
        //For Euro Conversion
        else if(code == 4)
        {
            System.out.println("Enter amount in Euro");
            euro = sc.nextFloat();
            rupee = euro * 70.29;
            System.out.println("Rupees : "+f.format(rupee));
            dollar =euro * 1.18;
            System.out.println("Dollar : "+f.format(dollar));
            pound = euro * 1.21;
            System.out.println("Pound : "+f.format(pound));
            yen = euro * 193.00;
            System.out.println("Yen : "+f.format(yen));
            riyal = euro * 3.69;
            System.out.println("Riyal : "+f.format(riyal));
            dinar = euro * 0.38;
            System.out.println("Dinar : "+f.format(dinar));
        }
        //For Yen Conversion
        else if(code == 5)
        {
            System.out.println("Enter amount in Yen");
            yen = sc.nextFloat();
            rupee = yen * 16.39;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = yen * 0.008;
            System.out.println("Dollar : "+f.format(dollar));
            pound = yen * 0.007;
            System.out.println("Pound : "+f.format(pound));
            euro = yen * 0.006;
            System.out.println("Euro : "+f.format(euro));
            riyal = yen * 0.022;
            System.out.println("Riyal : "+f.format(riyal));
            dinar = yen * 0.002;
            System.out.println("Dinar : "+f.format(dinar));
        }
        //For Riyal Conversion
        else if(code == 6)
        {
            System.out.println("Enter amount in Riyal");
            riyal = sc.nextFloat();
            rupee = riyal * 18.93;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = riyal * 0.25;
            System.out.println("Dollar : "+f.format(dollar));
            pound = riyal * 0.22;
            System.out.println("Pound : "+f.format(pound));
            euro = riyal * 0.21;
            System.out.println("Euro : "+f.format(euro));
            yen = riyal * 5.42;
            System.out.println("Yen : "+f.format(yen));
            dinar = riyal * 0.15;
            System.out.println("Dinar : "+f.format(dinar));
        }
        //For Dinar Conversion
        else if(code == 7)
        {
            System.out.println("Enter amount in Dinar");
            dinar = sc.nextFloat();
            rupee = dinar * 26.17;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = dinar * 0.33;
            System.out.println("Dollar : "+f.format(dollar));
            pound = dinar * 0.29;
            System.out.println("Pound : "+f.format(pound));
            euro = dinar * 0.27;
            System.out.println("Euro : "+f.format(euro));
            yen = dinar * 6.51;
            System.out.println("Yen : "+f.format(yen));
            riyal = dinar * 1.29;
            System.out.println("Riyal : "+f.format(riyal));
        }
        else
        {
            System.out.println("Invalid Code");
        }
    }
}