public class Hello {
	private String message;

	public Hello(String message) {
		this.message = message;
	}

	public Hello() {
		this("");
	}

	public static void main(String[] args) {
		Hello hello = new Hello("Hello, world!");
		System.out.println(hello);
	}

	public String toString() {
		return message;
	}
}