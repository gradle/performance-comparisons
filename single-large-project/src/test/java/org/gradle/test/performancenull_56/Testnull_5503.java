package org.gradle.test.performancenull_56;

import static org.junit.Assert.*;

public class Testnull_5503 {
    private final Productionnull_5503 production = new Productionnull_5503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}