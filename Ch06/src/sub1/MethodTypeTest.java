package sub1;

/*
 * ��¥ : 2020/05/06
 * �̸� : �ŵ�ȣ
 * ���� : �޼��� Ÿ�� �ǽ��ϱ�
 */

public class MethodTypeTest {
	
	// �ڹ� ���α׷� ���� �޼���
	public static void main(String[] args) {
		
		//�޼��� ȣ��(����)
		double r1 = type1(1.1);
		System.out.println("r1 : "+r1);
		
		type2(true);
		
		boolean r2 = type3();
		System.out.println("r2 : "+r2);
		
		type4();
		
		// ��������
		gugudan(2);
		gugudan(5);
		gugudan(7);
	
	} // main end
	
	// gugudan(n)
	public static void gugudan(int n) {
			
		System.out.println(n+"��");
		
		for(int i=1 ; i <= 9 ; i++) {
	    System.out.println(n+" x "+i+" = "+n*i);
		}

	}
	
	
	// type1 : �Ű����� O, ���ϰ� O
	public static double type1(double a) {
		
		double result = a + 3.14;
		return result;
	}
	
	// type2 : �Ű����� O, ���ϰ� X
	public static void type2(boolean isOk) {
		
		if(isOk) {
			System.out.println("�� �Դϴ�.");
		}else {
			System.out.println("���� �Դϴ�.");
		}
		}

	// type3 : �Ű����� X, ���ϰ� O
	public static boolean type3() {
		int num1 = 1, num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
	}

	// type4 : �Ű����� X, ���ϰ� X
	public static void type4() {
		System.out.println("type1(0.1) : "+type1(0.1));
	}

}
