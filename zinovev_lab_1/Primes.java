package zinovev_lab_1;

public class Primes {
 public static void main(String[] args) {
 //перебор всех чисел от 2 до 100 включительно
     for (int i=2; i<=100;i++){
         //если следующее число - простое, выводим его на экран
         if (iPr(i))
            System.out.println(i);
     }
 }

 //метод, проверяющий является ли входное число простым
 //true - входное число простое, false - нет
 public static boolean iPr(int n){
    //перебор всех чисел от 2 до входного (не включая его) для поиска делителей
    for (int i=2; i<n;i++){
        //если существует делитель входного числа, то оно не является простым - возвращаем false
        if (n % i == 0)
            return false;
    }
    //если делителей входного числа не нашлось - возвращаем true
    return true;
 }
}