package D0724;

import java.util.Scanner;

public class Q2023 {
	public Q2023(){
		solve();
	}
	public int fibo(Integer n){
		if(n==0)
			return 0;
		if(n== 1 || n == 2)
			return 1;
		else
			return fibo(n-2)+fibo(n-1);
	}
	
	
	public void solve(){
		Scanner scan= new Scanner(System.in);
		System.out.println("��ü �¼� ���� �Է�");
		int seat = scan.nextInt();//��ü�¼�
		System.out.println("��ü vip ���� �Է�");
		int num = scan.nextInt();//vip ��
		int vip=0; //vip�¼�
		int cur=0;//���� �� �¼�
		int result=1;//�����
	
		for(int i=0; i<num;i++){
			System.out.println("vip �¼� ��ȣ �Է�");
			vip=scan.nextInt();
			result*=fibo(vip-cur);
			cur=vip;
		}
		
		result*=fibo(seat-cur+1);
		System.out.println(result);
	}
	public static void main(String args[]){
		new Q2023();
		
	}
}
