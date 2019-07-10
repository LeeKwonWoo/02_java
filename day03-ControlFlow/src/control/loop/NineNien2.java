package control.loop;
/*
 * 234
 * 567
 * 89
 */
/*
 * 234
 * 345
 * 456
 */
public class NineNien2 {

	public static void main(String[] args) {
		int p = 3;
		int k = 0;
		int u = 0;
		for (int i = 2; i<=9; i++) {
			for (; k < p; k++) 	{
				if(i+k>9) {
					break;
				}
				System.out.printf("%d단\t\t",i+k);
			}
			System.out.println();
			for(int q = 1; q <=9; q++) {
				for (int t = 2; t<=4; t++) {
					if(t+u>9) {
						break;
					}
					System.out.printf("%d X %d = %d\t",t+u,q,q*(t+u));
				}
				
				System.out.println();
			}
			u += 3;
			p += 2;
			k -= 1;
			System.out.println();
		}

	}

}
