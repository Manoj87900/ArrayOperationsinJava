import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    int[] a = {1, 2, 3};
    int[] b = {4, 5, 6};

    int[] sum = ArrayOperations.addArrays(a, b);
    int[] diff = ArrayOperations.subtractArrays(a, b);
    int[] product = ArrayOperations.multiplyArrays(a, b);
    double[] quotient = ArrayOperations.divideArrays(a, b);
    int[] remainder = ArrayOperations.modArrays(a, b);

    System.out.println("A: " + Arrays.toString(a));
    System.out.println("B: " + Arrays.toString(b));
    System.out.println("Sum: " + Arrays.toString(sum));
    System.out.println("Difference: " + Arrays.toString(diff));
    System.out.println("Product: " + Arrays.toString(product));
    System.out.println("Quotient: " + Arrays.toString(quotient));
    System.out.println("Remainder: " + Arrays.toString(remainder));

  }

}

class ArrayOperations {

  public static int[] addArrays(int[] a, int[] b) {
    int[] sum = new int[a.length];
    for(int i=0; i < a.length; i++) {
      sum[i] = a[i] + b[i];
    }
    return sum;
  }
  public static int[] subtractArrays(int[] a, int[] b) {
    int[] diff = new int[a.length];
    for(int i=0; i < a.length; i++) {
      diff[i] = a[i] - b[i];
    }
    return diff;
  }

  public static int[] multiplyArrays(int[] a, int[] b) {
    int[] product = new int[a.length];
    for(int i=0; i < a.length; i++) {
      product[i] = a[i] * b[i]; 
    }
    return product;
  }

  public static double[] divideArrays(int[] a, int[] b) {
    double[] quotient = new double[a.length];
    for(int i=0; i < a.length; i++) {
      quotient[i] = a[i] / (double)b[i];
    }
    return quotient;
  }
  
  public static int[] modArrays(int[] a, int[] b) {
    int[] remainder = new int[a.length];
    for(int i=0; i < a.length; i++) {
      remainder[i] = a[i] % b[i]; 
    }
    return remainder;
  }

}