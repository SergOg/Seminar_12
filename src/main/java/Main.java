import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.ArithmeticUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Минимальное значение в массиве: " + descriptiveStatistics.getMin());
        System.out.println("Максимальное значение в массиве: " + descriptiveStatistics.getMax());
        System.out.println("Сумма значений в массиве: " + descriptiveStatistics.getSum());
        System.out.println("Среднеарифметическое значение в массиве: " + descriptiveStatistics.getMean());
        System.out.println("Факториал числа 5: " + ArithmeticUtils.factorial(5));
        System.out.println("Наибольший общий делитель для 10 и 30: " + ArithmeticUtils.gcd(10,30));
        System.out.println("Общее кратное для 15 и 25: " + ArithmeticUtils.lcm(15,25));
        System.out.println("Является ли 16 степеью 2: " + ArithmeticUtils.isPowerOfTwo(16));
    }
}
