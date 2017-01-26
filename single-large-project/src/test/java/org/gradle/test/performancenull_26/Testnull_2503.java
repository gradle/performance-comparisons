package org.gradle.test.performancenull_26;

import static org.junit.Assert.*;

public class Testnull_2503 {
    private final Productionnull_2503 production = new Productionnull_2503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}