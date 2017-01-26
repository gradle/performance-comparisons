package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36498 {
    private final Productionnull_36498 production = new Productionnull_36498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}