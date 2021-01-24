package _05_vault;

public class Bond {

	static Vault newVault = new Vault(100000);
	public static void findCode() {
		for(int i = 0; i<1000000; i++) {
			if(newVault.getCode()==i) {
				System.out.println(i);
			}else {
				break;
			}
		}
		System.out.println(-1);
	}
}
