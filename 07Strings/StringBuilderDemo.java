
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Ritik");
		System.out.println((sb));
		System.out.println(sb.charAt(0));
		sb.setCharAt(0, 'Z');
		System.out.println(sb);
		sb.insert(0, 'R');
		System.out.println(sb);
		sb.delete(1, 2);
		System.out.println(sb);
		// 4. Append (Add at end) - Efficient!
		sb.append("k");
		sb.append(" Kumar");
		System.out.println("After Append: " + sb);

		// 5. Reverse (Built-in method)
		sb.reverse();
		System.out.println("Reversed: " + sb);

		// 6. Capacity
		// StringBuilder reserves extra space to reduce resizing operations
		System.out.println("Capacity: " + sb.capacity());
		System.out.println("Length: " + sb.length());
	}
}
