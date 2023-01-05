package baekjun;

public class StringTest {

	public static void main(String[] args) {
		String s = "abcdefgh";
		StringBuffer sb = new StringBuffer(s); // String --> StringBuffer 변환
		StringBuilder sbl = new StringBuilder(s); // String --> StringBuilder 변환
		
		System.out.println("처음:" + sb);
		System.out.println("문자열 String 변환:" + sb.toString());
		System.out.println("추출:" + sb.substring(2, 5));
		System.out.println("추가:" + sb.insert(3, "추가"));
		System.out.println("삭제:" + sb.delete(2, 4));
		System.out.println("연결:" + sb.append("Ho"));
		System.out.println("길이:" + sb.length());
		System.out.println("크기:" + sb.capacity());
		System.out.println("역순 변경:" + sb.reverse());
		System.out.println("마지막결과:" + sb);
		
		System.out.println("처음" + sbl);
		System.out.println("문자열 String 변환" + sbl.toString());
		System.out.println("추출" + sbl.substring(2,5));
		System.out.println("추가" + sbl.insert(3, "추가"));
		System.out.println("삭제" + sbl.delete(2, 3));
		System.out.println("연결" + sbl.append("Ho"));
		System.out.println("길이" + sbl.length());
		System.out.println("크기" + sbl.capacity());
		System.out.println("역순변경" + sbl.reverse());
		System.out.println("결과" + sbl);
	}

}
