package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20498 {
    private final Productionnull_20498 production = new Productionnull_20498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}