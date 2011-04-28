package de.is2.git;

public class HelloWorld {

	protected String m_strText;
	
	public static void main (String[] a_oStrArgs) {
		HelloWorld oHelloWorld = new HelloWorld();
		oHelloWorld.run();
	}
	
	protected void run() {
		setText("asdf");
		printHelloWorld();
		printText();
	}

	protected void printText() {
		if (null != getText()) {
			System.out.println(getText());
		}
		System.out.println("");
	}

	protected void printHelloWorld() {
		System.out.println("Hello world. ");
	}
	
	public String getText() {
		return m_strText;
	}
	
	public void setText(String a_strText) {
		m_strText = a_strText;
	}

}
