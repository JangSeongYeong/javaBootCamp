package lv0.ex85_특별한이차원배열1;

public class Solution {
	/*정수 n이 매개변수로 주어질 때, 
	 * 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.
	 * arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0입니다*/
	
	public int[][] solution(int n) {
		// 크기에 맞는 2차원 배열 만들기
        int[][] answer = new int[n][n];
        
        // 배열에 i==j라면 1, 아니라면 0을 넣기
        for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[i].length; j++) {
				if (i == j) {
					answer[i][j] = 1;
				} else {
					answer[i][j] = 0;
				}
			}
		}
        
        return answer;
    }
}
