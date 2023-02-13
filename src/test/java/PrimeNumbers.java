import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {

    public List<Integer> calculate(Integer argument) {
        if (argument < 2)
            throw new IllegalArgumentException("L'argument est inf à 2");
        return IntStream.rangeClosed(2, argument)
                .filter(PrimeNumbers::isPrime)
                .boxed()
                .collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false; // 1 is not prime and also not composite
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }


}
