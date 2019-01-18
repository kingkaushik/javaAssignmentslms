package ping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PingHost
{
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter host ip-address or url:");
        String urlOrIp=scanner.next();
        int pingCount=5;
        double pingTime[]=new double[pingCount];
        Process process= Runtime.getRuntime().exec("ping -c "+pingCount+" "+urlOrIp);
        BufferedReader pingInputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));
        pingInputStream.readLine();
        for(int pingLineNumber=0;pingLineNumber<pingCount;pingLineNumber++)
        {
            String pingDescription[]=pingInputStream.readLine().split(" ");
            int pingDescriptionLength=pingDescription.length;
            String pingDescriptionTime[]=pingDescription[pingDescriptionLength-2].split("=");
            pingTime[pingLineNumber]=Double.parseDouble(pingDescriptionTime[1]);
        }
        Arrays.sort(pingTime);
        double medianPingTime;
        int halfOfPingCount=pingCount/2;
        if(pingCount%2==1)
        {
            medianPingTime=pingTime[halfOfPingCount+1];
        }
        else
        {
            medianPingTime=(pingTime[halfOfPingCount]+pingTime[halfOfPingCount+1])/2;
        }
        System.out.println("The median time taken to ping is "+medianPingTime+"ms");
    }
}
