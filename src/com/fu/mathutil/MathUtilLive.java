
package com.fu.mathutil;

/**
 *
 * @author lones
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);//hàm tính đi là mấy
        System.out.println("expected: 5! = 120: actual: " +result);
        System.out.println("expected: 6! = 720: actual: " +MathUtil.getFactorial(6));
        System.out.println("expected: 0! = 1: actual: " +MathUtil.getFactorial(0));

        //MathUtil.getFactorial(-5);//ném ngoại lệ r
        
        // kĩ thuật kiểm thử: ước lượng xem gái trị trả về là gì
        // hàm chạy thực tế là gì gọi là là actual
        //if expected == actual, hàm ngon trong tình huống này
        
    }
    
}
