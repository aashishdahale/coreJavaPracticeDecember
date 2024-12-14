package coreJava;

public class P19StringBufferAndStringBuilder {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Aashish");
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(" Dahale");
		System.out.println(sb);
		
		String str = sb.toString();
		System.out.println(str);
		sb.deleteCharAt(1);
		System.out.println(sb);
		sb.insert(0, "Java ");
		System.out.println(sb);
		sb.setLength(30);
		System.out.println(sb);
		sb.ensureCapacity(100);
		System.out.println(sb);
		
	}

}
