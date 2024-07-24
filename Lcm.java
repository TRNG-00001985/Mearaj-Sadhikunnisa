package code;
public class Lcm {
	public static void main(String[] args) {
		int a=54;
		int b=32;
		int lcm=0;
		int max=a>b?a:b; {
			for(int i=max;i<=a*b;i++) {
				if(i%a==0 && i%b==0) {
					lcm=i;
					break;
				}
			}
			System.out.println(lcm);
		}
	}
}
