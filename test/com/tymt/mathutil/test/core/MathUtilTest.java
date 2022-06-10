/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tymt.mathutil.test.core;

import com.tymt.mathutil.core.MathUtil;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ThanhTy
 */
public class MathUtilTest {

    //Đây là class sẽ sử dụng các hàm của thư viện/framework JUnit
    //Để kiểm thử/ kiểm tra code chính - hàm tínhGiaiThừa () bên
    //bên class core.MathUtil
    //Viết code để test code chính bên kia
    //Có nhiều quy tắc đặt tên hàm kiểm thử 
    //nhưng nhiều sẽ là nói lên mục đích của các case/tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại!!
    //hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    //xài hàm kiểu well - đưa 5!, 6!, hok chơi đưa -5!, 30!
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //có nhiều @Test ứng nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; // test thử tình huống TỬ TẾ đầu vào -> phải chạy đúng
        long expected = 1; // hy vọng = 1
//        long actual = expected;//gọi hàm cần test bbên core
        long actual = MathUtil.getFactiorial(n);

        //so sánh expected vs actual dùng FRAMWORK
        assertEquals(expected, actual);

        //gộp thêm vài case thành công/đưa đầu vào ngon
        assertEquals(1, MathUtil.getFactiorial(1)); //tui mún 1! = 1
        assertEquals(2, MathUtil.getFactiorial(2)); //tui mún 2! = 2
        assertEquals(6, MathUtil.getFactiorial(3)); //tui mún 3! = 2
        assertEquals(24, MathUtil.getFactiorial(4)); //tui mún 4! = 24
        assertEquals(120, MathUtil.getFactiorial(5)); //tui mún 5! = 120
        assertEquals(720, MathUtil.getFactiorial(6)); //tui mún 6! = 720

        //Hàm giúp so sánh xem 2 giá trị có giống hay kh
        //hàm ok -> màu xanh
        //else -> màu đỏ khi expected vs actual ko giống nhau
        //hàm getF() ta thiết kế có 2 tình huống xử lí
        //1. đưa data tử tế trog [0..20] -> tính đúng n! - done
        //2. đưa data vào cà chớn, âm > 20; THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ
        //TAO KÌ VỌNG NGOẠI Ệ XUẤT HIỆN KHI N < 0 || N > 20
        //RẤT MONG NGOẠI LỆ XUẤT HIỆN VỚI N CÀ CHỚN NÀY
        //nếu hàm nhận vào n < 0 hoặc n>20 và hàm ném ra ngoại lệ 
        //-> hàm đúng theo thiết kế
        //test case:
        //input : -5
        //expected: IllegalArgumentException xuất hiện
    }

    //tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu
    //là nhưng thứ ko thể đo lường so sánh theo kiểu value
    //mà chỉ có thể đo lường= cách chúng có xuất hiện hay ko
    //assertEqals() ko dùng để so sanh 2 ngoại lệ
    //MÀU ĐỎ, DO HÀM ĐÚNG LÀ CÓ NÉM NGOẠI LỆ THẬT SỰ
    //              NHƯNG KO PHẢI LÀ NGOẠI LỆ NHƯ KÌ VỌNG - THỰC SỰ KÌ VỌNG SAI
    //              KO PHẢI NÉM SAI
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongAgrumentThrowException(){
//        MathUtil.getFactiorial(-5); //Hàm @Test chạy, hay hàm getF() chạy
//                                    // sẽ ném về ngoại lệ
//    }
    //Màu xanh 
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongAgrumentThrowException() {
        MathUtil.getFactiorial(-5); //Hàm @Test chạy, hay hàm getF() chạy
        // sẽ ném về ngoại lệ
    }

    //còn 1 cách khác để bắt ngoại lệ xuất hiện tự nhiên hơn
    //XÀI LAMBDA
    //Test case: hàm sẽ ném vào ngoại lệ nếu nhập vào 21
    //tui cần thấy màu xanh khi chơi với 21!
//    @Test
//    public void testGetFactorialGivenWrongAgrumentThrowException_LambdaVer(){
//        
//        Assert.assertt
//        
//        MathUtil.getFactiorial(-5); //Hàm @Test chạy, hay hàm getF() chạy
//                                    // sẽ ném về ngoại lệ
//    }
    //Bắt ngoại lệ xem hàm có ném về ngoại lệ hay ko khi N cà chớn
    //có ném, tức là hàm chạy đúng thiết kế -> xanh
    @Test
    public void testGetFactorialGivenWrongAgrumentThrowException_TryCatch() {

        try {
            MathUtil.getFactiorial(-5);
        }catch (Exception ex) {
            // bắt try catch là JUnit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ
            //nhưng ko chắc ngoại lệ mình cần có xuất hiện hay ko??
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException
            Assert.assertEquals("Invalid Arrgument. N mus in 0...20",
                    ex.getMessage());
        }
    }
}
