/*
*ДЗ:
1. Написать метод принимающий колличество дней (положительное или отрицательное)
*  и возвращающий дату в виде таймстемпа (миллисикунды с 1970 года) в виде long.

2. Доработать метод из ДЗ предыдущего урока, увеличивающий баланс таким образом:
*  если сложили 2 больших положительных числа, но получилось отрицательное - вернуть 0

3. можно и даже лучше дорабоать во 2-ом задании текущего ДЗ.
*  Организовать проверку таким образом: если складываем положительные числа, но получаем отрицательное,
*  то вывести 0, если получаем положительное, но вычитаем из него большее (т.е. получаем отрицательное),
*  то возвращаем отрицательное.
*  Так же учесть кейс, когда у нас первое число отрицательное и второе положительное/отрицательное.
*  Иначе говоря:  пытаемся придумать как проверить, что не произошло дерьмо с int overflow.
*
* */

public class SecondHomework {

    // 1st exercise
    public long DateInMiliSec (long quantityDay){
        long dateInMiliSec = 0;

        dateInMiliSec = System.currentTimeMillis() + quantityDay * 24 * 3600;

        return dateInMiliSec;
    }

    // 2nd exercise

    public int AccountIncrease (int account, int profit){
        int newAccount = account + profit;

        if ( account > 0 && profit > 0 && newAccount < 0)
            newAccount = 0;

    return newAccount;
    }

    // 3d exercise

    public int AccountIncreaseVer2 (int account, int profit){
        int newAccount = account + profit;

        if ( account >= 0 && profit > 0 && newAccount < 0)
            newAccount = 0;
        if ( account <= 0 && profit < 0 && newAccount >= 0)
            newAccount = -1;

        return newAccount;
    }

    public static void main(String[] args) {

    }

}
