package ru.childnov;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/***
 * Тесты НОД
 */
class CommonDivisorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getDivisor() {
        GCD gcd = new GCD();
        Assertions.assertEquals(gcd.getDivisor(144,24),24);
        Assertions.assertEquals(gcd.getDivisor(143,24),1);
        Assertions.assertEquals(gcd.getDivisor(15,6),3);
    }
}