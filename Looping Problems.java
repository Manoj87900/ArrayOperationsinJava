//Looping Problems:
//Prime Numbers in a Range:

int start = 10; 
int end = 50;   
for (int i = start; i <= end; i++) {
    boolean isPrime = true;
    for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
            isPrime = false;
            break;
        }
    }
    if (isPrime) {
        System.out.print(i + " ");
    }
}


//Palindrome Number:

int num = 12321; 
int originalNum = num;
int reversed = 0;
while (num != 0) {
    int digit = num % 10;
    reversed = reversed * 10 + digit;
    num /= 10;
}
if (originalNum == reversed) {
    System.out.println(originalNum + " is a palindrome");
} else {
    System.out.println(originalNum + " is not a palindrome");
}

//Print Pascal's Triangle:

int N = 5; 
for (int i = 0; i < N; i++) {
    int number = 1;
    for (int j = 0; j <= i; j++) {
        System.out.print(number + " ");
        number = number * (i - j) / (j + 1);
    }
    System.out.println();
}

//Print a Diamond Pattern:

int n = 5; 
for (int i = 0; i < n; i++) {
    for (int j = i; j < n - 1; j++) {
        System.out.print(" ");
    }
    for (int k = 0; k <= i * 2; k++) {
        System.out.print("*");
    }
    System.out.println();
}
for (int i = n - 2; i >= 0; i--) {
    for (int j = n - 1; j > i; j--) {
        System.out.print(" ");
    }
    for (int k = 0; k <= i * 2; k++) {
        System.out.print("*");
    }
    System.out.println();
}


//Find Armstrong Numbers:

int start = 100; 
int end = 1000;  
for (int i = start; i <= end; i++) {
    int num = i;
    int sum = 0;
    int digits = String.valueOf(i).length();
    while (num > 0) {
        int digit = num % 10;
        sum += Math.pow(digit, digits);
        num /= 10;
    }
    if (sum == i) {
        System.out.print(i + " ");
    }
}

