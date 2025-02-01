/**
 * 백준 10998번 문제
 * 브론즈 5 / A x B
 * 두 수를 입력받고 곱셈을 한 결과를 출력하는 문제
 * 입력 : 2 3
 * 출력 : 6
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        System.out.println(num1 * num2);
    }
}
