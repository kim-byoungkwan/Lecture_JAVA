package kr.ac.kopo.day04;

// �迭�̶� "���� Ÿ���� ����"�� �������� ������ ������ �� �ְ� �ϴ� ������ ũ�⸦ ���� �ڷᱸ��(����)
// �迭�� ����ڰ� ������ ������ �����ϴ� �Ϳ� ���� ���ŷο��� ���̱� ���ؼ� ���� ���̴�.
// �����͸� ȿ�������� ������ �� �ִ� ������� ����������� ���� �ڷᱸ���ϰ� �Ѵ�.
// �������ڿ� �������� ����ū ���̴� �� ���� �ͼ��� ���̴�. �׷��� �������ڶ�� �����ڿ� ���õ� å�� ���� �о���Ѵ�.
// �̻����, ���������, ��Ʈ��ũ ������ �˾ƾ��Ѵ�.
// ��ǻ�Ϳ� ���� �� ���ϸ� ��ư� �������Եȴ�.
// ��ǻ�Ͱ� ������ ������ ������ �� �ִ� ���� ������ �̸��� �ƴ϶� ������ ����� ���� �ּҰ������� �����Ѵ�.
// int a,b,c,d �� ���� ������ �������� ���ǵ��� ��� ��ǻ�ʹ� ������ �ּҸ�  a,b,c,d ���� ������ ���ؼ��� �����ϰ�
// �־�� �ϹǷ�, ��������� �������� ��ȿ�����̴�. �׷��Ƿ�, �迭�� �����ϰ� �ƴ�. ��, a,b,c,d ������ ��������� �ϳ���
//    ��ģ ��������� ���� �Ͱ��� ���� ���� �迭�̴�.
// �̷��� �迭�� �迭�� �̸��� �Բ� �迭�� ����� ������ �����ּҰ��� �����Ѵ�.
// �迭�� �ٽ����� ������ �迭�� �����ϰ� �ִ� ����Ÿ���� ������ ����ڰ� ȿ�������� ������ �� �ֵ��� �ϴ� ���ε�,
// ������ ����� �����ּҰ��� �����Ƿ� �迭�� �����ϰ� �ִ� ���� ���� �����ּҰ��� ������. 
// ����, �迭�� ���� Ÿ���� ������ ���������� �����س��� ��������̹Ƿ� �迭�� ù��° ������ �����ּҰ��� �˱⸸ �ϸ�,
// �迭���� ������ ���������� ����Ǿ������Ƿ�, �迭���� �������� �����ּҰ��� ������ �� �ִ�.
// �迭�̶�� ��������� �׻� ����Ÿ���� ������ ���������� �����ϰ� �ִ�.

// �迭�� ������ ��, �迭�� ũ�⸦ �����ϴ� ���� �� ũ��� �ٽ� ������ �� ����. ��, �迭�� �׻� ������ �� �ִ� ������ ũ�Ⱑ
// �����Ǿ��ִ�.

// �޸𸮴� ���ð� ���� �����ϴµ� ������ ũ��� ������������, ���� ũ��� ���������� �ʴ�. ������ ũ�Ⱑ �������̹Ƿ�
// �迭�� ���ÿ� �����ϸ� ������ ������ ������������. �׷��Ƿ�, ���� �迭�� �����ϰ� �ȴ�.

// ���� ������� ��������� ��ü��� �� �� �ִ�. ��, new��� ��ɾ ���� ������� ��� ���� ���� ����ǹǷ�,
// new�� ���� ������� ��� ���� ����� ���� ��ü��� �� �� �ִ�.

// �迭�� ����Ÿ���� ������ ���������� ����Ǿ������Ƿ�, ������ �����ϴ� ������ �����ּ��� ��ġ���� ���ؼ� ������ ������ �� ������,
// ���� Ÿ���� ������ ���������� �����ϰ� �����Ƿ�, ���� Ÿ���� ������ ù��° ������ ���� ���° ��ġ�� �����ϰ� �ִ����� 
// ���ؼ��� ������ ��ġ�� ��Ȯ�� ��Ÿ�� �� �ִ�.

// �迭�� ũ��� ������ �� �������Ƿ�, ũ�Ⱑ ���������� �ʴ�. �׷��Ƿ�, �迭�� ������ ũ�⸦ ���� �����Ƿ�, �迭��
// ������ �ƴ� ���� ��������� �����Ͽ� �����ϰԵȴ�. ��, �迭�� ���� ����Ǿ�� �ϹǷ� new��� �޼ҵ带 ���ؼ� �����Ѵ�.
// new��� �޼ҵ带 ����ϸ� ���� ��� �����͸� ������ �� �ִ� ��������� �����Ǵµ� �� ������� ��ü�� ��ü��� �� �� �ִ�.

// ����, ���� ��������� ������ �迭�� �����ϱ� ���ؼ��� ����� �迭�� �����ּҰ��� �ʿ��ѵ�, �����ּҴ� ���ÿ� ����Ǿ��ִ�.

// double[] aaa �� �ǹ̴� aaa��� �̸��� ���� �迭 ������ double Ÿ���� �迭�� �����ּҸ� ����ϰ� �ִٴ� �ǹ��̴�.
// �׸��� = ���� new double[]�� �ǹ̴� double��� Ÿ���� ������ ������ �� �ִ� ��������� �迭�� heap�� ���������
// ���� �����Ѵٴ� �ǹ��̴�.
// double[] �� ������� ������ ���� �ƴ϶�, �Բ� �����ִ� ������ �ν��ؼ� 2���� ������ �ϳ��� �ڷ������� �ν��� �� �ִ�.
// ��, double[] aaa�� �ǹ̴� aaa��� �̸��� ���� ������ "double���� �����͸� ���������� ���� �迭�� �ڷ����̴�" ���
// �ǹ̸� ǥ���ϰ�, "double ���� �����͸� ���������� ���� �迭�� �̸��� aaa�ε� aaa�� �� �迭�� �����ּ� ���� �����ϰ� �ִ�
// �������� ��Ÿ����.
// double[][] aaa�� ���� 2���� �迭�� ������ �ǹ̸� ���´�. �� aaa�� double�� �����͸� ���������� �����ϰ� �ִ�
// �迭�� �����ּҰ��� �����ϰ� �ִ� �����̴ٶ�� ���̴�. ��, ǥ���Ǳ⿡�� �迭�� ǥ���� �Ǿ�������, �����δ� �迭�� 
// �ּҰ��� ����ϰ� �ִ� ǥ���� double[][] aaa�� ��Ÿ���� �ִ� �������� �ǹ��̴�. ���� ���� ���� �� aaa������ 
// �����ϰڴٴ� �ǹ̸� new ��� �޼ҵ带 �̿��ؼ� new �迭����[�迭ũ��] �� ���� ǥ������ ���Ǹ� ����� ��μ�
// �迭�� �ּҰ��� �����ϰ� �ִ� ������ ���� �迭�� �����͸� ������ �� �ִ� ������ ���ð� ���� ���� �����Ǿ� �迭�� 
// ��μ� ���ǵǴ� ���̴�.
// ����, ��� ��ü�� ��ü�� �̸��� �����ּ��� ��, �׸��� ���� �����ϰ� �ִ� �����͸� ���� �����Ƿ�, ��� ��ü��
// ���������� ���� ���� �������� �����ϰ� �Ǵ� ���̴�.

// new��� �޼ҵ带 ���� ��������� �������� ��������� �׻� ��������� �����Ǵ� �⺻���� ���´�. �� �⺻���� �����Ǵ�
// ��������� �������� ���� �����Ǵ� ������ �ʱ�ȭ���̶�� �Ѵ�.



// ũ�Ⱑ 100���� �迭�� ���ؼ��� ��ġ���� �����ϰ� �ִ� ������ �迭�� �����ּҸ��� �����ϰ� �ִ�.

// ��簴ü������ ���� ==> �ڷ��� ������ = new �ڷ���() ��� ��ü�� �̷��� ������ ������ �����ǰԵȴ�.

// ���� ����� ��ü�� �����ּҰ��� ����ϰ��ִ� �����̸��� �˸� �����ּҰ��� �˰�, �� ���� �ּҰ����κ��� ������ 1�� �Ÿ�
// ��ŭ ������ �ִ� ����, 2�� �Ÿ���ŭ ��������� ������ �ִ� ���� ~ �� ������ �� �ִµ�, 
// �̷��� ������ ���� �迭�� ������ ������ �� �ִ�. �̶� ��ü�� ����� �����ּ��� �����κ��� ������� ��ġ���� �ε������ �Ѵ�.

// �迭�� ũ�⸦ �����Ӱ� ������ �� �ִٴ� ������ �������� ������, �ѹ� ���ǵǰ��� �迭�� ũ�⸦ ������ ������.

// ����ȯ �̶�� ���� �������� ���� �ڷ����� ���ϴ� ���� �ƴϴ�.����ȯ�� ��Ű�� ������ �״�� ������, �Ͻ������� 
// ���� ���ϴ� �ڷ������� �ν��ϰ��� �ϰڴٴ� ���̴�.

// int[] prime = new int[5]; 
// int[] prime = new int[7];

// �̿� ���� ���ǵǾ����� ��, prime�̶�� int�� �ڷ����� 5�� �����ϴ� �迭�� prime�̶�� ������ ���� 7�� �����ϴ�
// �迭�� ����Ű�� �Ǵ� ��Ȳ���� ���ϰ� �ȴ�. �׸���, ������ ũ�Ⱑ 5���� �迭�� ������ �� � �����ּҰ��� �����ϰ��ִ�
// ������ int[5] �迭 ������ ����Ű�� ���� �ʰ� �Ǵµ�, �̶� �� ������ ������ �����̶�� �Ѵ�. ����, �̰�� prime������
// ����Ǿ� �ִ� �迭�� �����ּҰ� ���� ����Ű�� ��������� ��ġ�� �ٲ�����Ƿ� �ٲ�� �ȴ�.

// �����ڷ������� ������� ��������� �Ҵ�Ǵ� �⺻��, �� �ʱ�ȭ ���� null���� �Ҵ�ȴ�.
// �⺻�ڷ����� int�� ������� �迭�� int[] prime = new int[4]; �������� �迭�� �������ڸ��� prime[0]�� ����
// �ʱ�ȭ���� 0���� ����ǰԵȴ�.

// �迭�� �׻� new���ؼ��� ���� �� �ִ�.


public class ArrayMain01 {
	
	public static void main(String[] args) {
		
		int[] arr;

		arr = new int[5];
		
//		System.out.println("arr : " + arr);
		
		// new�λ����� ��ü���� �ڵ��ʱ�ȭ�� �Ͼ��.
		// �׷��Ƿ�, ���� ����� new�� ���ٰ� ����������, arr��ü�� �ʱ�ȭ�������� �����Ƿ�, ��ó�� ������ 
		// ����Ű�� �ִ� ��������� ���� �ּҰ��� ��µ��� �ʴ´�.
				
		System.out.println("arr : " + arr);
		
		// �̰�쿣 �ּҰ��� ������ �ȴ�.
		
		arr = new int[10];
		
		System.out.println("arr : " + arr);
		
		// ���� arr����������, �ּҰ��� �ٸ���. �ֳĸ� arr������ ����Ű�� �ִ� �������� �迭�� ��������� �ٸ��� �����̴�.
		
		// for������ ���� i�� �ַ� ���� ������ i�� �Ϲ������� �ε��� i�� �ǹ��ϱ� �����̴�.�׸��� �ε�����
		// 0���� �����ϱ� ������ �ʱⰪ�� �Ϲ������� 0���� �����ϰԵȴ�.
		// ���� ũ�Ⱑ 5�� �迭�� ��� �Ʒ��� ���� ������������ 5���� �۴��� �ǹ̷� ǥ���Ѵ�.
		// �׸���,
		
		// for(int i = 0; i < arr.length; i++) �� ���� ǥ���ϱ⵵ �Ѵ�.
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println(i + "��° ���� : " + arr[i]);
			
		}
		
		// �� ���Ұ��� 10, 20, 30, 40, 50�� �����ϴ� ���
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (i+1) * 10;
			
		}
	
	}
	
}
