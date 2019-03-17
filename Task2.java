

import java.io.*;
import java.util.*;


public class Task2 {
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    static Scanner br = new Scanner(System.in);
    
    static{
        try {
            float res,p,t,r;
            int c;
            bw.write(" Simple interest \n Enter principle amount : ");
        	bw.flush();
        	p=br.nextFloat();
        	bw.write("\n Enter rate of interest : ");
        	bw.flush();
        	r=br.nextFloat();
        	r=r/100;
        	bw.write("\n Enter no. of years : ");
        	bw.flush();
        	t=br.nextFloat();
            bw.write(" Enter your choice \n 1.Simple interest \n 2.Compound interest \n Enter no. : ");
            bw.flush();
            c=br.nextInt();
            switch(c)
            {
            case 1:
            	res=p*r*t;
            	bw.write(" interest amount : "+res);
            	break;
            case 2:
            	float tt;
            	tt=(1+r);
            	res=1;
            	int i=0;
            	while(i<t)
            	{
            		res=res*tt;
            		i++;
            	}
            	//res=(1+r)^t;
            	res=p*res;
            	res=res-p;
            	bw.write(" interest amount : "+res);
            	break;
            default:
            	bw.write(" invalid option ");
            }
            bw.close();
            br.close();
            
        } catch (IOException ex) {
        }
        System.exit(0);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
