package _05_vault;

public class Bond {
	
	public static int findCode() {
		int code = 0;
		for(int i = 0; i<1000000; i++) {
			if(newVault.getCode()==i) {
				code = i;
			}else {
				code = -1;
			}
		}
		System.out.println(code);
		return code;
	}
}
