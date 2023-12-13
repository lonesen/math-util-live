/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

public class MathUtil {
    ///hồi quy code
    //n!= 1..2.3.4.5
    // quy ước  0! = 1! =1
    //Ko tính giao thừa cho số âm
    // 20! là vừa khớp kiểu long, kiểu long tối đa là 18 con số 0
    //21! là lố kiểu long
    // nếu đưa vào âm hay 21! ko tính
    /// đưa ngoại lệ
    public static long getFactorial(int n){
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument. n must be betwen  0...20");
            ///hàm dùng ko cần return;
        if ( n == 0 || n == 1) 
            return 1;
            
        //chơi f0r hoặc đệ quy -recursion
        // i = 2, i = 3, i = 4, i = n nhồi liên tục
        long product = 1;/// tích = nhồi liên tục
        for (int i = 2; i <= n; i++) 
            product *= i; ///product nhân liên tục với i
            //product = product * i;
        return product;
        
    }
}
