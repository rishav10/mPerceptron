import java.util.*;
import java.lang.*;
public class ProgPerceptron
{
	public void Spack()
	{
		System.out.println("import.java.util.*;");
	}
	public void Bpack()
	{
		System.out.println("import java.io.*;");
	}
	//----------------SCANNER OBJECT CREATION----------------------
	public void Sobj()
	{
		System.out.println("Scanner sc = new Scanner(System.in);");
	}
	//----------------BUFFERED READER OBJECT CREATION---------------
	public void Bobj()
	{
		System.out.println("BufferedReader br = new BufferedReader(new InputStreamReader);");
	}
	public void cpack()
	{
		System.out.print("class ");
	}
	//------------------TO PRINT STRAY STRING--------------------------
	public void cname(String classname)
	{
		System.out.println(classname);
	}
	//---------------------MAIN FUNCTION-----------------------------
	public void mfunc()
	{
		System.out.println("public static void main(String[] args)");
	}
	//--------------------MAIN WITH EXCEPTION HANDLING
	public void mfunc1()
	{
		System.out.println("public static void main(String[] args)throws Exception");
	}
	//--------------------PRINT WITH QUOTES----------------
	public void printwithquote(String param)
	{
		System.out.println("System.out.println(\""+param+"\");");
	}
	//------------------PRINT WITHOUT QUOTES------------------
	public void printwithoutquote(String param)
	{
		System.out.println("System.out.println("+param+");");
	}
	//------------------CLOSE BRACES-----------------
	public void closebrace() 
	{
		System.out.println("}");
	}
	//------------------OPEN BRACES-------------------
	public void openbrace()
	{
		System.out.println("{");
	}
	//------------------REMAINDER------------------
	public void remainder()
	{
		System.out.println("r = n%10;");
	}
	//-----------------Palindrome 1-------------------
	public void pal()
	{
		System.out.println("sum = (sum*10) + r;");
	}
	//------------------N = N/10----------------------
	public void n10()
	{
		System.out.println("n = n/10;");
	}
	//------------------SCANNER INPUT FOR INT--------------
	public void scannerinputInt()
	{
		System.out.println("sc.nextInt();");
	}
	//------------------BUFFERED READER INPUT FOR INT-----------
	public void bufferinputInt()
	{
		System.out.println("Integer.parseInt(br.readLine());");
	}
	//------------------SCANNER INPUT FOR STRING----------------
	public void scannerinputString()
	{
		System.out.println("sc.nextLine();");
	}
	//-------------------BUFFERED READER INPUT FOR STRING-------------
	public void bufferinputString()
	{
		System.out.println("br.readLine();");
	}
	//----------------INITIALIZATION OF N--------------------------
	public void init()
	{
		System.out.println("int n;");
	}
	//------------------------INPUTTING------------------
	public void inp()
	{	
		System.out.println("System.out.println(\"Enter the number - \");");
		System.out.print("n=");
	}
	//-----------------INITIALIZATION FOR pALINDROME---------------
	public void pinit()
        {
                System.out.println("int r,sum=0,temp;");
        }
	//-----------------INITIALIZATION FOR FIBONACCI-----------------
	public void fibovarinit()
	{
		System.out.println("int a=0,b=1,c=0;");
	}
	//-------------------WHILE N > 0------------------------
	public void wloop()
	{
		System.out.println("while(n>0)");
	}
	//-------------------LOOP STATEMENT 0 TO N-----------------
	public void loop()
	{
		System.out.println("for(int i=0;i<=n;i++)");
	}
	public void cond()
	{
		System.out.println("if(n%2==0)");		
	}
	//------------------PRINT ONLY ELSE---------------------
	public void elseprint()
	{
		System.out.println("else");
	}
	//-----------------PRINT YES----------------------
	public void yes()
	{
		System.out.println("System.out.println(\"Yes\");");
	}
	//-----------------PRINT NO------------------------
	public void no()
	{
		System.out.println("System.out.println(\"No\");");
	}
	public void pcond()
	{
		  System.out.println("if(temp == sum)");
	}
	public void fiboo()
	{
		System.out.println("a=b;");
		System.out.println("b=c;");
		
	}
	public void tem()
	{
		System.out.println("temp = n;");
	}
	public void add()
	{
		System.out.println("c=a+b;");
	}
		
	/*public static void main(String[] args)
	{
		/*Self a = new Self();
		a.Spack();
		a.cpack();
		a.cname();
		a.mfunc();
		a.print("Hello");
		a.endmain();
		a.endclass();
	*/

	static double theta1[] = new double[2];
	static double theta2[] = new double[2];
	static double theta3[] = new double[2];
	static double theta4[] = new double[5];
	static double a1[] = new double[2];
	static double a2[] = new double[2];
	static double a3[] = new double[2];
	static double a4[] = new double[5];
	public  static int train(int inputs[][],int outputs[],int epoch)
	{
		//random initialisation
		Random r = new Random();
		/*theta1[] = new double[2];
		theta2[] = new double[2];
		theta3[] = new double[2];
		theta4[] = new double[1];*/



		// why is this loop running 2 times??
		//
		// why there are 5 weitage??
		// ===============================
		
		for(int i = 0;i < 2;i++)
		{
			theta1[i] = r.nextDouble();
			theta2[i] = r.nextDouble();
			theta3[i] = r.nextDouble();
			theta4[i] = r.nextDouble();
		}
		theta4[2] = r.nextDouble();
		theta4[3] = r.nextDouble();
		theta4[4] = r.nextDouble();
		/*a1[] = new double[2];
		a2[] = new double[2];
		a3[] = new double[2];
		a4[] = new double[1];*/	
		a1[0] = a1[1] = 1;
		a2[0] = 1;
		a3[0] = 1;
		//a4[0]=1; //a4[1]=1;
		for(int i1 = 0;i1 < inputs.length;i1++)
		{
			int j1 = 0;
			a2[1] = inputs[i1][j1];
			a3[1] = inputs[i1][j1+1];
			a4[0] = inputs[i1][j1+2];
			a4[1] = inputs[i1][j1+3];
			a4[2] = inputs[i1][j1+4];
			a4[3] = inputs[i1][j1+5];
			a4[4] = inputs[i1][j1+6];
			for(int i = 0;i<epoch;i++)
			{
				theta3[0] = r.nextDouble();
				theta3[1] = r.nextDouble();	
				a2[1] = sigmoid(a1[0]*theta1[0] + a1[1]*theta1[1]);
				a3[1] = sigmoid(a2[0]*theta2[0] + a2[1]*theta2[1]);
				a4[0] = sigmoid(a3[0]*theta3[0] + a3[1]*theta3[1]);
				//a4[1] = sigmoid(a4[0]*theta4[0]+a4[1]*theta4[1]);
				//a4[3]=sigmoid(a4[1]*theta5[0]+a4[2]*theta5[1]);
				 theta3[0] = r.nextDouble();
				 theta3[1] = r.nextDouble();
				 a4[1] = sigmoid(a3[0]*theta3[0] + a3[1]*theta3[1]);
				 theta3[0] = r.nextDouble();
				 theta3[1] = r.nextDouble();
				 a4[2] = sigmoid(a3[0]*theta3[0] + a3[1]*theta3[1]);
				 theta3[0] = r.nextDouble();
				 theta3[1] = r.nextDouble();
				 a4[3] = sigmoid(a3[0]*theta3[0] + a3[1]*theta3[1]);
				 theta3[0] = r.nextDouble();
                                 theta3[1] = r.nextDouble();
				 a4[4] = sigmoid(a3[0]*theta3[0] + a3[1]*theta3[1]);

			}
			
		}
		if((a1[1] + a2[1] + a3[1] + a4[0] + a4[1] + a4[2] + a4[3] + a4[4]) > 7)
			return 1;
		else
			return 0;
	}

	public static double sigmoid(double a)
	{
		return 1/(1+Math.exp(-a));
	}

		
	public static void main(String args[])
	{
		ProgPerceptron t = new ProgPerceptron();
/* ====
 *
 *what is this training???
 *
 *
 *==== */
		int aps[][] = {{1,1,1,1,1,1,1},{1,1,0,0,0,1,0},{1,1,0,1,0,0,0},{1,0,1,0,0,0,0},{0,0,1,1,0,0,0}};
		int apss[] = {1,1,0,0,0,0};
		t.train(aps,apss,200);
		Scanner sc = new Scanner(System.in);		
		System.out.println("Fibonacci/Odd Even/Palindrome/Printing ?");
		String flag=sc.nextLine();
		String ch="",classname="";
		int cout=0;
		//cc:
		/*do
		{
		System.out.println("What do you want to name your class ?");
		classname=sc.nextLine();
		if(((int)classname.charAt(0))<65 || ((int)classname.charAt(0))>122 || (((int)classname.charAt(0)>90) && ((int)classname.charAt(0)<97)))
		{
			//cout++;
			System.out.println("A Class name cannot start with a Special Character or digit !");
			//continue cc;
		}
			
	}while(((int)classname.charAt(0))<65 || ((int)classname.charAt(0))>122 || (((int)classname.charAt(0)>90) && ((int)classname.charAt(0)<97)));
	*/	System.out.println("What do you want to name your class ?");
		classname=sc.nextLine();
		for(int i=1;i<classname.length();i++)		
		{
			if(((int)classname.charAt(0))<65 || ((int)classname.charAt(0))>122 || (((int)classname.charAt(0)>90) && ((int)classname.charAt(0)<97)))
				{
				i=0;
				System.out.println("A Class name cannot start with a Special Character or digit !");
				System.out.println("What do you want to name your class ?");
		        classname=sc.nextLine();
			}
			else if(Character.isDigit(classname.charAt(i))==false && ((int)classname.charAt(i))!=95 && Character.isLetter(classname.charAt(i))==false)
			{							
				i=0;
				System.out.println("A class name cannot contain special characters except '_'");
				System.out.println("What do you want to name your class ?");
		        classname=sc.nextLine();
		     }
		     else if(classname.equals("class")==true || classname.equals("void")==true || classname.equals("static")==true)
		     {
				i=0;
				System.out.println("A class name cannot be a reserved keyword");
				System.out.println("What do you want to name your class ?");
		        classname=sc.nextLine();  
			}  		
		}
		if(flag.equalsIgnoreCase("printing"))
		{
			ch="Qwerty";
		}		
		else
		{
		System.out.println("Scanner or BufferedReader");	
		ch = sc.nextLine();
	    }
	    
		String param="";
		if(flag.equalsIgnoreCase("printing"))
			{
				System.out.println("What do you want to print?");
		        param = sc.nextLine();
			}
			System.out.println(a1[1]);
			System.out.println(a2[1]);
			System.out.println(a3[1]);
			System.out.println(a4[0]);
			System.out.println(a4[1]);
			System.out.println(a4[2]);
			System.out.println(a4[3]);
			System.out.println(a4[4]);
			System.out.println("\n");
		if(a1[1] >= 0.5)
		{
			if(ch.equalsIgnoreCase("scanner"))
			{
				t.Spack();
			}
			else if(ch.equalsIgnoreCase("buffer"))
			{
				t.Bpack();
			}
		}
		if(a2[1] >= 0.5)
		{
			t.cpack();
			t.cname(classname);
			t.openbrace();
		}
		if(a3[1] >= 0.5)
		{
			if(ch.equalsIgnoreCase("scanner")||flag.equalsIgnoreCase("printing"))
			{
				t.mfunc();
				t.openbrace();
			}
			else
			{
				t.mfunc1();
				t.openbrace();
			}
		}
		if(a4[0] >= 0.5)
		{
			
			if(ch.equalsIgnoreCase("scanner"))
			{
				t.Sobj();
			}
			else if(ch.equalsIgnoreCase("buffer"))
			{
				t.Bobj();
			}
		
			
		}
		if(flag.equalsIgnoreCase("printing"))
		{
		        t.printwithquote(param);
			}
		else
		{
			
		if(a4[1]>=0.5)
		{
			if(ch.equalsIgnoreCase("scanner"))
			{
				t.init();
				t.inp();
				t.scannerinputInt();
			}
			else if(ch.equalsIgnoreCase("buffer"))
			{
				t.init();
				t.inp();
				t.bufferinputInt();
			}
			
		}
		if(a4[2]>=0.5)
		{
			if(flag.equalsIgnoreCase("fibonacci"))
			{
				t.fibovarinit();
				t.loop();
				t.openbrace();
			}
		}
		if(a4[3]>=0.5)
		{
			if(flag.equalsIgnoreCase("odd"))
			{
				t.cond();
				t.printwithquote("Even");
				t.elseprint();
				t.printwithquote("Odd");
			}
			else if(flag.equalsIgnoreCase("fibonacci"))
			{
				t.printwithoutquote("c");
				t.fiboo();
				t.add();
				t.closebrace();
			}
			
				
		}
		if(a4[4]>=0.5)
		{
			if(flag.equalsIgnoreCase("palindrome"))
			{
				t.pinit();
				t.tem();
				t.wloop();
				t.openbrace();
				t.remainder();
				t.pal();
				t.n10();
				t.closebrace();
				t.pcond();
				t.yes();
				t.elseprint();
				t.no();
			}
		
		}
			
			t.closebrace();
			t.closebrace();
		}
	}
}
