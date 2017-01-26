package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25003 {
    private final Productionnull_25003 production = new Productionnull_25003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}