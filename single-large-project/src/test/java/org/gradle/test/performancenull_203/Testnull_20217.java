package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20217 {
    private final Productionnull_20217 production = new Productionnull_20217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}