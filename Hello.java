publi class Hello {
	public static void main(String[] args) {
		String str = "Hello Java!";
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 1) {
				System.out.print("=");
			} else {
				System.out.println("=");
			}
		}
	}
}
