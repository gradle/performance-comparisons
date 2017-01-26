package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20270 {
    private final Productionnull_20270 production = new Productionnull_20270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}