package com.example.lab2;

import org.springframework.web.bind.annotation.*;

@RestController
public class Lab2ApplicationController {
//    @RequestMapping("/currentTime")
//    public LocalDateTime currentTime(){
//        return LocalDateTime.now();
//    }
//@GetMapping("/currentWeekInMonth")
//public int currentWeekInMonth() {
//    LocalDate today = LocalDate.now(); // Получаем текущую дату
//    return today.get(ChronoField.ALIGNED_WEEK_OF_MONTH); // Получаем номер недели в месяце
//}
//@RequestMapping("/api")
//public String num(@RequestParam int q){
//    StringBuilder result = new StringBuilder();
//    for (int i = 1; i <= q; i++) {
//        result.append(i).append(" ");
//    }
//    return result.toString();
//
//}
//@RequestMapping("/random_num")
//public double random(){
//    return new Random().nextDouble(2)+2;
//
//}git

//    @RequestMapping("/fib")
//    public long fibonacci(@RequestParam int n) {
//        if (n < 0) {
//            throw new IllegalArgumentException("error");
//        }
//        return fib(n);
//    }
//    private long fib(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }


    @GetMapping("/{repeat}")
public int a(@PathVariable String repeat){
        return repeat.length();
}
}


