class GeneratorTest {

	private final Password password = new Password("Secret");
	private final Alphabet firstAlphabet = new Alphabet(true, false, false, false);
	private final Alphabet secondAlphabet = new Alphabet(false, true, true, true);
	private final Generator generator = new Generator(true, false, false, false);

	public static void main(String[] args) {
		GeneratorTest test = new GeneratorTest();
		test.test1();
		test.test2();
		test.test3();
		test.test4();
		test.test5();
	}

	void test1() {
		if (!"Secret".equals(password.toString())) {
			System.err.println("test1 failed");
		} else {
			System.out.println("test1 passed");
		}
	}

	void test2() {
		if (!firstAlphabet.getAlphabet().equals(Alphabet.UPPERCASE_LETTERS)) {
			System.err.println("test2 failed");
		} else {
			System.out.println("test2 passed");
		}
	}

	void test3() {
		if (!secondAlphabet.getAlphabet().equals(Alphabet.LOWERCASE_LETTERS + Alphabet.NUMBERS + Alphabet.SYMBOLS)) {
			System.err.println("test3 failed");
		} else {
			System.out.println("test3 passed");
		}
	}

	void test4() {
		if (!generator.alphabet.getAlphabet().equals(Alphabet.UPPERCASE_LETTERS)) {
			System.err.println("test4 failed");
		} else {
			System.out.println("test4 passed");
		}
	}

	void test5() {
		if (generator.alphabet.getAlphabet().length() != 26) {
			System.err.println("test5 failed");
		} else {
			System.out.println("test5 passed");
		}
	}
}
