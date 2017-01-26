package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21376 {
    private final Productionnull_21376 production = new Productionnull_21376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}