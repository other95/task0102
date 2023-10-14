package ru.childnov;

public class GCD implements CommonDivisor {
    public int getDivisor(int firstNumber, int secondNumber) {
        if (secondNumber > firstNumber) {
            int buf = firstNumber;
            firstNumber = secondNumber;
            secondNumber = buf;
        }

        int remainder;
        while (true) {
            remainder = firstNumber % secondNumber;
            if ( remainder == 0 ) {
                break;
            }
            firstNumber = secondNumber;
            secondNumber = remainder;
        }
        return secondNumber;
    }
}
