package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20283 {
    private final Productionnull_20283 production = new Productionnull_20283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}