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
		System.out.println("전체 좌석 개수 입력");
		int seat = scan.nextInt();//전체좌석
		System.out.println("전체 vip 개수 입력");
		int num = scan.nextInt();//vip 수
		int vip=0; //vip좌석
		int cur=0;//현재 센 좌석
		int result=1;//결과물
	
		for(int i=0; i<num;i++){
			System.out.println("vip 좌석 번호 입력");
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
