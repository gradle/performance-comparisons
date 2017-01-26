package org.gradle.test.performancenull_273;

import static org.junit.Assert.*;

public class Testnull_27243 {
    private final Productionnull_27243 production = new Productionnull_27243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}