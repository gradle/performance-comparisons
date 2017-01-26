package org.gradle.test.performancenull_79;

import static org.junit.Assert.*;

public class Testnull_7869 {
    private final Productionnull_7869 production = new Productionnull_7869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}