package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9801 {
    private final Productionnull_9801 production = new Productionnull_9801("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}