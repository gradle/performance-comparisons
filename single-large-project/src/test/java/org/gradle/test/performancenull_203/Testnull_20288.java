package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20288 {
    private final Productionnull_20288 production = new Productionnull_20288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}