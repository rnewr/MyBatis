package com.ohgiraffers.section01.xmlmapper;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        do{

            System.out.println("======================직원 전체 조회=========================");
            System.out.println("1. 직원 전체 조회 하기");
            System.out.println("2. 연본 순서대로 직원 나열하기");
            System.out.println("3. 연봉 가장 높은사람 퇴사시켜서 없애버리기");
            System.out.println("9. 종료하기");
            System.out.println("메뉴 번호를 입력하세요 : ");

            int no = sc.nextInt();

            switch (no){
                case 1 : TestService.selectAllEmp(); break;
                case 2 : break;
                case 3 : break;
                case 9 :
                    System.out.println("시스템을 종료합니다..."); return;

            }

        } while (true);

    }


}
