package programmers;

// 문제: 124 나라의 숫자
/*
124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

10진법  | 124 나라  | 10진법  | 124 나라
1     |  1	    |  6	| 14
2     |  2	    |  7    | 21
3     |  4	    |  8    | 22
4	  |  11     |  9    | 24
5     |	 12     | 10    | 41
자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.

제한사항
n은 500,000,000이하의 자연수 입니다.

입출력 예
n |	result
1 |	1
2 |	2
3 |	4
4 | 11

*/


//수학적 사고력 문제
//진수에 대한 의미 → 3의 진수를 사용. 0, 1, 2로 표현하는 것이 아니라 4,1,2로 표현.
public class Country_124_Numbers {

	// solution1 → 이미 반환 타입에서 힌트를 주고 있다.= String
	public static String solution1(int n) {

		// 최종 답
		String answer = "";

		// 1,2,4로만 표현하기 위한 값을 저장
		int reminder;

		// n이 0이하가 될때까지 무한반복 → 숫자가 커질때도 고려하는 문제들은 왠만하면 while문으로 반복하자.
		while (n > 0) {

			// 10진수를 3개씩 묶으면 규칙이 보이므로 3으로 나눈다.
			reminder = n % 3;

			// n의 몫을 구한다.
			n = n / 3;

			// 나머지가 0일때.
			if (reminder == 0) {

				// 출력 예시를 보면 10진수가 3의 배수일때는 10의 자리숫자가 이전의 숫자보다 몫이 1이 더 크기때문에 빼준다.
				n -= 1;

				// 그리고 나머지를 4로 넣어준다.
				reminder = 4;

			}

			// 최종답에 나머지값을 앞에 더해준다. int + String = String이다.
			answer = reminder + answer;
		}

		return answer;
	}

	// solution2
	public static String solution2(int n) {

		// 1,2,4 규칙을 위해서 배열에 저장한다. 3의 배수일때는 4, 3으로 나눴을 때 1이면 1, 3으로 나눴을 때 2이면 2로 일의
		// 자리숫자부터 만들어 간다.
		String[] num = { "4", "1", "2" };
		// 최종답
		String answer = "";

		// 여기서도 큰 숫자들을 고려해야되기 때문에 while문으로 반복한 것이다.
		while (n > 0) {

			// 입력된 숫자를 3으로 나누고 인덱스에 따라서 최종답에 String + String = String으로 저장.
			answer = num[n % 3] + answer;

			// 입력된 수가 0이하가 될때까지 1을 뺀 후, 3으로 나눈다.
			n = (n - 1) / 3;

		}

		return answer;
	}

	//test
	public static void main(String[] args) {
		int n = 1;
		
		while (n<20) {
			
			System.out.println(solution1(n));
			System.out.println(solution2(n));
			n++;
		}
		
		

	}

}
