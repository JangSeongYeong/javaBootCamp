
public class StmtSwitch {

	public static void main(String[] args) {
		
		String item = "캔커피";
		
		// jdk 1.6 이하에서는 switch 문에 숫자, 문자(문자열X)만 사용 가능하다.
		switch (item) { // 모든 구문은 코드블록 시작({) 부터 끝(})까지 읽게 되어있다.
		case "콜라": // case 문에서는 특정 case 위치로 이동시켜 주지만 코드블럭 끝까지 가야만 한다.
			System.out.println(item+"가 나왔습니다.");
			break; // 그래서 특정 케이스 실행 이후에 break 를 통해 해당 코드블록을 빠져나오는 것이다.
		case "생수":
			System.out.println(item+"가 나왔습니다.");
			break;
		case "오랜지주스":
			System.out.println(item+"가 나왔습니다.");
			break;
		default:
			System.out.println(item+"은 보유하지 않고 있습니다.");
			break;
		}
		
	}

}
