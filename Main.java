//TODO:
//TODO:

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("지뢰 찾기 프로그램에 오신걸 환영합니다.");
        System.out.println("실행을 하시려면 1을 입력해주세요.");
        System.out.println("무조건 정수만 입력 하셔야 합니다!");


        int start = scr.nextInt();
        int count = 5 ;
        while (count!= 0){
            System.out.println("총 기회는 5번 입니다.");
            System.out.printf("%d 번 남았습니다.\n", count);
            if(start==1) {
                System.out.println("지뢰인 숫자(정수) 하나가 숨어있습니댜. 숫자를 입력해주세요.");
                int a = scr.nextInt();
                if(a==81){
                    System.out.println("지뢰입니다.");
                }
                if(a<81){
                    System.out.println("업입니다.");
                }
                if(a>81){
                    System.out.println("다운입니다.");
                }
            }
            count--;
        }

        }
    }