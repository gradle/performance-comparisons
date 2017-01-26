package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1754 {
    private final Productionnull_1754 production = new Productionnull_1754("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}