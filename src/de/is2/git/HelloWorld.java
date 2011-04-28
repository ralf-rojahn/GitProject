package de.is2.git;

public class HelloWorld {

	protected String m_strText = "asdf";
	
	public static void main (String[] a_oStrArgs) {
		HelloWorld oHelloWorld = new HelloWorld();
		oHelloWorld.run();
	}
	
	protected void run() {
		System.out.println("Hello world. " + getText());
	}
	
	public String getText() {
		return m_strText;
	}
	
	public void setText(String a_strText) {
		m_strText = a_strText;
	}

}
