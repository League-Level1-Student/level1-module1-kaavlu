package _05_vault;

public class Vault {
	static int lockCode;
	

	public Vault(int code) {
		setCode(code);
	}
	
	public void setCode(int code) {
		lockCode = code;
	}
	
	public int getCode() {
		return lockCode;
	}
	
	public boolean tryCode(int inputCode) {
		boolean TrueorFalse;
		if(lockCode == inputCode) {
			TrueorFalse = true;
		}else {
			TrueorFalse = false;
		}
		return TrueorFalse;
	}
	Vault newVault = new Vault(100000200);
}
