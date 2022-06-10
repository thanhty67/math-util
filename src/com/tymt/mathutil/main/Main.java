/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tymt.mathutil.main;

import com.tymt.mathutil.core.MathUtil;

/**
 *
 * @author ThanhTy
 */
public class Main {
    public static void main(String[] args) {
        //thử nghiệm hàm tính giai thừa chạy đúng thiết kế hay k
        //ta phải đưa các tình huống sử dụng hàm trong thực tế
        //ví dụ đưa vào -5 coi tính đc k, 0 coi là mấy, 20 là mấy, 21 coi tính ra mấy
        // TEST CASE: một tình huống hàm/app/màn hình/ tính năng đc đưa vào sử dụng
        //giả lập hành vi xài của ai đó!!
        
        //TEST CASE: Là một tình huống sử dụng, xài app (hàm) mà nó bao hàm
        //1> INPUT: DATA ĐẦU vào cụ thể nào đó
        //2> OUTPUT: đầu ra ứng vs xử lí của hàm/chức năng của app
        //dĩ nhiên dùng đầu vào để xử lí
        //KÌ VỌNG: Mong hàm sẽ trả về value nào đó ứng vs input ở trên
        //3> SO sanh để biết kết quả có như kì vọng hay 0
        
        long expected = 120; //kì vọng 120 nếu tính 5 giai thừa 
        int n = 5;
        System.out.println("5! = 120 (expected)");
        long actual = MathUtil.getFactiorial(n);
        System.out.println("5! = " + actual + "(Actual)");
    }
}
