
public class Printf_And_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		double d=2.3;
		boolean b=true;
		char c='#';
		String s="Haider";
		System.out.printf("Integer: %d\n",i);
		System.out.printf("Double/Float: %f\n",d);
		System.out.printf("Boolean: %10b\n",b);
		System.out.printf("Character: %c\n",c);
		System.out.printf("String: %s\n",s);
		
		System.out.println("__________________________________");
		System.out.printf("Integer: %10d  \n",i);
		System.out.printf("Integer: %-10d	\n",i);
		System.out.printf("Double/Float: %.0f\n",d);
		
		//using final you can not change the value of what you have declared, in case of function
		//no overriding
		
		final String[] arr={"a","b","c"};
		arr[0]="d";
		
		final int a=10;//cannot update
		System.out.println("ARRAY : "+arr[0
		                                  ]);
		

	}

}
