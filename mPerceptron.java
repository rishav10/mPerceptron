import java.util.*;
import java.lang.*;
public class mPerceptron
{
	public void Spack()
	{
		System.out.println("import.java.util.*");
	}
	public void Bpack()
	{
		System.out.println("import java.io.*");
	}
	public void Sobj()
	{
		System.out.println("Scanner sc = new Scanner(System.in)");
	}
	public void Bobj()
	{
		System.out.println("BufferedReader br = new BufferedReader(new InputStreamReader)");
	}
	public void cpack()
	{
		System.out.print("class\t");
	}
	public void cname()
	{
		System.out.println("anyname");
		System.out.println("{");
	}
	public void mfunc()
	{
		System.out.println("public static void main(String[] args)");
		System.out.println("{");
	}
	public void print(String param)
	{
		System.out.println("System.out.println("+param+")");
	}
	public void endmain()
	{
		System.out.println("}");
	}
	public void endclass()
	{
		System.out.println("}");
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
	static double theta4[] = new double[1];
	static double a[][] = new double[5][2];
	//static double a[2][] = new double[][2];
	//static double a[3][] = new double[][2];
	//static double a[4][] = new double[][1];
	public  static int train(int inputs[][],int outputs[],int epoch)
	{
		//random initialisation
		Random r = new Random();
		/*theta1[] = new double[2];
		theta2[] = new double[2];
		theta3[] = new double[2];
		theta4[] = new double[1];*/
		for(int i = 0;i<2;i++)
		{
			theta1[i] = r.nextDouble();
			theta2[i] = r.nextDouble();
			theta3[i] = r.nextDouble();
			//theta4[i] = r.nextdouble();
		}
		theta4[0] = r.nextDouble();
		/*a1[] = new double[2];
		a2[] = new double[2];
		a3[] = new double[2];
		a4[] = new double[1];*/
		for(int k = 1;k<inputs.length-1;k++)
		{
			a[k][0] = 1;
		}
		//a[2][0] = 1;
		//a[3][0] = 1;
		for(int i1 = 0;i1<inputs.length;i1++)
                {
                     
			for(int j1 = 1;j1<inputs.length;j1++)
				{
                                a[j1][1] = inputs[i1][j1-1];
                                /*a2[1] = inputs[i1][j1+1];
                                a3[1] = inputs[i1][j1+2];
                                a4[0] = inputs[i1][j1+3];
                */
				} 

		for(int i = 0;i<epoch;i++)
		{
			
			a[2][1] = sigmoid(a[1][0]*theta1[0] + a[1][1]*theta1[1]);
			a[3][1] = sigmoid(a[2][0]*theta2[0] + a[2][1]*theta2[1]);
			a[4][1] = sigmoid(a[3][0]*theta3[0] + a[3][1]*theta3[1]);

		}
		}
		if((a[1][1] + a[2][1] + a[3][1] + a[4][1]) > 3)
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
		mPerceptron t = new mPerceptron();

		int aps[][] = {{1,1,1,1},{1,1,1,0},{1,1,0,1},{1,0,1,0},{0,0,1,1}};
		int apss[] = {1,0,0,0,0};
		t.train(aps,apss,200);
		Scanner sc = new Scanner(System.in);
		System.out.println("what do you want to print?");
		String param = sc.nextLine();
		System.out.println("Scanner or BufferReader");
		String ch = sc.nextLine();
			System.out.println(a[1][1]);
			System.out.println(a[2][1]);
			System.out.println(a[3][1]);
			System.out.println(a[4][1]);
		if(a[1][1] >= 0.5)
		{
			if(ch == "scanner")
			{
				t.Spack();
			}
			else
			{
				t.Bpack();
			}
		}
		if(a[2][1] >= 0.5)
		{
			t.cpack();
			t.cname();
		}
		if(a[3][1] >= 0.5)
		{
			t.mfunc();
		}
		if(a[4][1] >= 0.5)
		{
			if(ch.equalsIgnoreCase("scanner"))
			{
				t.Sobj();
			}
			else
			{
				t.Bobj();
			}
			t.print(param);
			t.endmain();
			t.endclass();
		}
	}
}

