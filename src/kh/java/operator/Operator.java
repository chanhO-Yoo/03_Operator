package kh.java.operator;

public class Operator {
	public static void main(String[] args) {
		Operator op = new Operator();
//		op.test();
//		op.test1();
//		op.test2();
//		op.test3();
//		op.test4();
		op.test5();
		
	}

	/*
	 * 단항연산자 
	 */
	public void test() {
		//1. 부호연산자
		int a = +5;
		short b = -9;
		System.out.println(-a);//-5
		System.out.println(-b);//+9
		
		//2. 증감연산자
		int c = 7;
		long d = 3L;
		float e = 6.2f;
		double f = 6.3;
		
		c++;
//		c = c + 1;
		d--;
//		d = d - 1;
		e++;
		f++;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		System.out.println("---------------");
		
		int k = 10;
		int l = 20;
		
		//전위 증감 연산자 : ++k, --k
		//먼저 1증가(감소)한 뒤 다른 연산을 한다.
		System.out.println("++k="+(++k));
		System.out.println("--k="+(--k));
		
		//후위 증감 연산자 : k++, k--
		//인접 연산에 먼저 사용된 뒤 1증가(감소)한다.
		System.out.println("l++="+(l++));
		System.out.println("l--="+(l--));
		System.out.println("l="+(l));
		
		//3.논리부정연산자
		// !:true -> false, false -> true
		boolean bool = true;
		bool = !bool;
		System.out.println("bool="+bool);
		bool = !bool;
		System.out.println("bool="+bool);
		bool = !!bool;
	}
	
	public void test1() {
		int x = 10;
		int y = 10;
		int z = ++x; // z = x = x + 1; x = 11, z = 11
		
		System.out.println("x="+x);
		System.out.println("z="+z);
		
		z = y++;
		System.out.println("z="+z);
		System.out.println("y="+y);
		
		x = 20;
		z = x++ + --y;//z = 20 + 10 뒤 x = 21로 변경, y는 11에서 10으로 바뀌어 대입
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		
		int m = 20;
		int n = m++ + m; //20 + 21
		System.out.println("m="+m);
		System.out.println("n="+n);
		
		m = 20;
		n= m++ + --m; // 20 + 20
		System.out.println("m="+m);
		System.out.println("n="+n);
	}
	
	/*
	 * 이항 연산자
	 */
	public void test2() {
		//1.산술연산
		int a = 30;
		int b = 20;
		int c = 0;
		
		c = a*b;
		System.out.println("c="+c);
		
		c = a/b;
		System.out.println("c="+c);
		
		//나머지 연산
		c = a%b;
		System.out.println("c="+c);
		
		//2.비교연산
		a = 3;
		b = 50;
		c = 11;
		boolean bool = (a==b);//false
		
		bool = a!=b;//Not equal
		System.out.println("bool="+bool);
		bool = a<b;//LT, Less Than
		System.out.println("bool="+bool);
		bool = a>b;//GT, Greater Than
		System.out.println("bool="+bool);
		bool = a<=b;//LE, Less than or Equal to
		System.out.println("bool="+bool);
		bool = a>=b;//GE, Greater than or Equal to
		System.out.println("bool="+bool);
		
		char ch = 'A';
		bool = a+b+c < ch;
		System.out.println("bool="+bool);
	}
	
	/*
	 * 논리 비교 연산자 &&, || => boolean
	 * 
	 * (좌항 :비교연산) && (우항:비교연산)
	 * (좌항 :비교연산) || (우항:비교연산)
	 * 
	 */
	public void test3() {
//		int a = 10;
//		boolean bool1 = a>0;//t
//		boolean bool2 = a<=10;//t
//		boolean bool3 = a<10;//f
//		boolean bool4 = a<5;//f
//		
//		//AND연산 : 좌항이 참이면서, 우항도 참인경우
//		System.out.println(bool1 && bool2);//t&&t => t
//		System.out.println(bool1 && bool3);//t&&f => f
//		
//		//OR연산 : 좌항이 참이거나, 우항도 참인경우
//		System.out.println(bool1 || bool2);//t||t => t
//		System.out.println(bool1 || bool3);//t||f => t
		
		int a = 1;
		int b = 1;
		//&&(AND) 좌항이 true 인 경우
		System.out.println(a>0 && ++b>0);//t&&t
		System.out.printf("a=%s, b=%s%n",a,b);
		
		a = 1;
		b = 1;
		//&&(AND) 좌항이 false 인 경우
		System.out.println(a<0 && ++b>0);//f&&t
		System.out.printf("a=%s, b=%s%n",a,b);
		
		a = 1;
		b = 1;
		//||(OR) 좌항이 false 인 경우
		System.out.println(a<0 || ++b>0);//f||t
		System.out.printf("a=%s, b=%s%n",a,b);
		
		a = 1;
		b = 1;
		//||(OR) 좌항이 true 인 경우
		System.out.println(a>0 || ++b>0);//t||t
		System.out.printf("a=%s, b=%s%n",a,b);
		
		a = 1;
		b = 1;
		//&,| : 좌우항의 값을 무조건 알아본다.
		System.out.println(a>0 | ++b>0);//t|t
		System.out.printf("a=%s, b=%s%n",a,b);
	}
	
	/*
	 * 삼항연산자
	 * (조건식) ? (참일 때 값) : (거짓일 때 값);
	 * 
	 */
	public void test4() {
		int a = 15;
		int b = 7;
		int c = (a>b)?a:b;
		System.out.println("c="+c);
		
		c = (a>b)?++a:++b;
		System.out.println("c="+c);
		
		//명령어는 올 수 없다.
//		c = (a>b)?System.out.prinln(a):System.out.println(b);
		
		//연속적 사용
		c = (a>b)?a:(b>0?b:0);
		System.out.println("c="+c);
	}
	
	/*
	 * 복합 대입 연산자
	 */
	public void test5() {
		int a = 15;
//		a = a +10;
		a += 10;
		System.out.println("a="+a);

		a -= 10;
		System.out.println("a="+a);
		
		a *= 10;
		System.out.println("a="+a);
		
		a /= 10;
		System.out.println("a="+a);
		
		a %= 10;
		System.out.println("a="+a);
	}
}
