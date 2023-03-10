public class Exercise1003 {
    public static void main(String[] args) {
        MyInteger int1 = new MyInteger(23);
        MyInteger int2 = new MyInteger(56);
        MyInteger int3 = new MyInteger(2);
        MyInteger int4 = new MyInteger(23);

        System.out.printf("%d is prime? %s%n", int1.getValue(), int1.isPrime());
        System.out.printf("%d is prime? %s%n", int2.getValue(), int2.isPrime());
        System.out.printf("%d is prime? %s%n", int3.getValue(), int3.isPrime());

        System.out.printf("%d is even? %s%n", int1.getValue(), int1.isEven());
        System.out.printf("%d is even? %s%n", int2.getValue(), int2.isEven());
        System.out.printf("%d is even? %s%n", int3.getValue(), int3.isEven());

        System.out.printf("93 is odd? %s%n", MyInteger.isOdd(93));
        
        System.out.printf("%d equals %d? %s%n", int1.getValue(), int4.getValue(), int1.equals(int4));

        System.out.printf("%d%n", MyInteger.parseInt(new char[] {'1', '5', '6'}));
        System.out.printf("%d%n", MyInteger.parseInt("454"));
    }
}


class MyInteger {
    private int mValue;

    public MyInteger(int value) {
        mValue = value;
    }

    public int getValue() {
        return mValue;
    }

    public boolean isEven() {
        return (mValue % 2) == 0;
    }

    public boolean isOdd() {
        return (mValue % 2) == 1;
    }

    public boolean isPrime() {
        if (mValue == 1 || mValue == 2) {
            return true;
        }
        else {
            for (int i = 2; i < mValue; i++) {
                if (i % mValue == 0) return false;
            }
        }
        return true;
    }

    public static boolean isEven(int myInt) {
        return (myInt % 2) == 0;
    }

    public static boolean isOdd(int myInt) {
        return (myInt % 2) == 1;
    }

    public static boolean isPrime(int myInt) {
        if (myInt == 1 || myInt == 2) {
            return true;
        }
        else {
            for (int i = 2; i < myInt; i++) {
                if (i % myInt == 0) return false;
            }
        }
        return true;
    }    

    public static boolean isEven(MyInteger myInt) {
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }

    public boolean equals(int testInt) {
        if (testInt == mValue) 
            return true;
        return false;
    }

    public boolean equals(MyInteger myInt) {
        if (myInt.mValue == this.mValue) 
            return true;
        return false;
    }

    public static int parseInt(char[] values) {
        int sum = 0;
        for (char i : values) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}