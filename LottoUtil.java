package kr.ac.kopo.day02;

import java.util.Random;

/**
 * �̰��� ����ȭ �ּ��̶�� �Ѵ�.
 * Lottoutil Ŭ������ �ζǿ� ���õ� �������� ��� Ŭ������ �ǹ��Ѵ�.
 * @author kim-byoungkwan
 *
 */

public class LottoUtil {
	
	public void todayProbabiltiy() {
		
		Random r = new Random();
		
		int p = r.nextInt(101);
		// ������ �������� ������ �����ϰڴٴ� �ǹ��̴�. �̰�� ���ڰ��� 101�� ���������Ƿ�, 0 ~ 100�� ���ڸ� �����ϰԵȴ�.
		// �� 101�� ���������� �������� ������ 0~100�� ���ڰ� ����ǹǷ�, �̷��� ������ �ǹ��ϴ� �����̴�.
				
		System.out.println("������ �ζ� Ȯ���� " + p +  "%�Դϴ� ");
		
	}

}
