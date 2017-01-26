package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1559 {
    private final Productionnull_1559 production = new Productionnull_1559("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}