package day10.lang;

/*
 * [[ String Class ]]
 * 	문자열을 다루는 클래스
 *	불변(immutable)의 객체 - 메모리에서 문자열 값이 변경되지 않는다. 
 * 		1. 메모리 절약
 * 		2. Security Up
 * 		3. Thread Safe
 * 
 */

public class MainClass04 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		str1 = "def";
		System.out.println(System.identityHashCode(str1));
		
		// 문자열 길이 length
		String txt = "ABCDEFGHIJK";
		System.out.println("length : " + txt.length());
		
		// 문자열이 지정한 문자로 시작하는지 판단
		String str4 = "apple";
		boolean startsWith = str4.startsWith("a");
		System.out.println("startsWith: " + startsWith);
		
		// 문자열 마지막에 지정한 문자가 있는지 판단
		String str5 = "text";
		boolean endsWith = str5.endsWith("t");
		System.out.println("endsWith : " + endsWith);
		
		// 문자 인덱스번호 반환
		String str6 = "abcdef";
		int indexOf = str6.indexOf("d");
		System.out.println("indexOf : " + indexOf);
		
		// 문자열에 지정한 문자가 마지막 몇번째에 있는지 int를 반환
		String str7 = "AndroidApp";
		int lastIndexOf = str7.lastIndexOf("A");
		System.out.println("lastIndexOf : " + lastIndexOf);
		
		// 문자 치환
		String str8 = "A*B*C*D";
		String replace = str8.replace("*", "-");
		System.out.println("replace : " + replace);
		
		// 문자열 나누기(배열로 반환) - 많이 사용함
		String str9 = "A:B:C:D:abcd";
		String[] splits = str9.split(":");	// {"A", "B", "C", "D", "abcd"}
		for(String split : splits) {
			System.out.println(split);
		}
		
		// 문자열 절삭
		String str10 = "ABCDEF";
		String substring = str10.substring(0, 2);
		System.out.println("substring : " + substring);
		
		// 소문자 변환
		String str11 = "abcDEf";
		String toLowerCase = str11.toLowerCase();
		System.out.println("toLowerCase : " + toLowerCase);
		
		// 대문자 변환
		String str12 = "abcDEF";
		String toUpperCase = str11.toUpperCase();
		System.out.println("toUpperCase : " + toUpperCase);
		
		// 공백제거
		String str13 = "      java java java        ";
		String trim = str13.trim();
		System.out.println("trim : " + trim);
		
		// 글자 사이 공백제거
		String str14 = "      java java java        ";
		String replace2 = str14.replace(" ", "");
		System.out.println("replace 공백제거 : " + replace2);
		
		// 문자비교
		String str15 = "A";
		String str16 = "B";
		int compareTo = str15.compareTo(str16);
		System.out.println("compareTo : " + compareTo);
		if(compareTo > 0) {
			System.out.println(str15 + " > " + str16);
		} else if(compareTo == 0) {
			System.out.println(str15 + " = " + str16);
		} else {
			System.out.println(str15 + " < " + str16);
		}
		
		// 문자 포함여부
		String str17 = "abcd";
		String str18 = "c";
		boolean contains = str17.contains(str18);
		System.out.println("contains: " + contains);
		
		// 문자열을 동적으로 다루기 위한 클래스
		// String과 달리 가변(mutable)이다.
		// Thread Safe O!
		StringBuffer sb = new StringBuffer();
		// 문자열 추가
		sb.append("abc");
		System.out.println("sb : " + sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("def");
		System.out.println("sb : " + sb);
		System.out.println(System.identityHashCode(sb));
		
		// 문자열 삽입
		sb.insert(6, " java");
		System.out.println("sb : " + sb);
		
		// 문자열 삭제
		sb.delete(7, 8);
		System.out.println("sb : " + sb);
		
		sb.replace(6, 7, " j");
		System.out.println("sb : " + sb);
		
		sb.reverse();
		System.out.println("sb : " + sb);
		
		
		// StringBuffer 동일한 기능을 한다.
		// Thread Safe X 아니다!
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("abc");
		sBuilder.append("def");
		System.out.println("sBulider : " + sBuilder);
		
		
		
		
		
		
		
		
		
	}

}
