package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23498 {
    private final Productionnull_23498 production = new Productionnull_23498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}