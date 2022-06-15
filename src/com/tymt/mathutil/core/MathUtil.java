/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tymt.mathutil.core;

/**
 *
 * @author ThanhTy
 */
public class MathUtil {
    //Trong class này cung cấp cho ai đó nhiều hàm 
    //Clone class Math của JDK
    //Hàm thư viện dùng chung mà ko cần lưu lại trạng thái/giá trị
    //ta sẽ thiết kế là hàm STATIC

    //hàm tính giai thừa!!!
    //n! = 1.2.3.4
    //KO có giai thừa số âm
    //0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa 18 con số 0, vừa đủ kiểu long 
    //21 giai thưa tràn kiểu long
    //quy ước 0!...20!
    
//    public static long getFactiorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid Arrgument. N mus in 0...20");
//        }
//        if (n == 0 || n == 1) {
//            return 1; //kết thúc cuộc chơi nhận vào các đầu vào đặc biệt
//        }
//        long product = 1;
//        for (int i = 2; i <= n; i++) {
//            product *= i;//product = product * i;
//        }
//        return product;
//    }

    //Học đẹ quy trong 30s - RECURSION
    //Hiện tượng gọi lại chính mình với 1 quy mô khác
    //Ví dụ: Con búp bê Nga, giống nhau và lồng trong nhau
    //búp bê to, nhỏ hơn, nhỏ hơn nữa 
    //tính dùm tui 6!
    //6! = 6*5!
    //5! = 5 * 4!
    //......
    //1! = 1;
    //Chốt hạ: n! = n * (n-1)!
    public static long getFactiorial(int n) {
        
        if (n == 0 || n == 1) {
            return 1; //kết thúc cuộc chơi nhận vào các đầu vào đặc biệt
        }
        
        return n * getFactiorial(n - 1);
    }

}
