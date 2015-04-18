/*
 * Name: Đặng Huy Hoàng
 * Class: DH12DT
 */
public class TokenJava {
	private int count = -1;
	private String data;
	private String charc;
	private String[] array;

	public TokenJava(String data, String charc) {
		this.data = data;
		this.charc = charc;
		array = data.split(charc);
	}

	public boolean hasMoreToken() {
		return this.count < this.array.length-1;
	}

	public String nextToken() {
		if (this.hasMoreToken()) {
			this.count +=1;
			return this.array[this.count];
		}
		return "";
	}

	public static void main(String[] args) {
		String a = "Dai Hoc Nong Lam TP.HCM";
		String b = "Hoc";
		TokenJava token = new TokenJava(a, b);
		while(token.hasMoreToken()){
			System.out.println(token.nextToken());
		}
	}
}
