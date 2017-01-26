package org.gradle.test.performancenull_129;

import static org.junit.Assert.*;

public class Testnull_12869 {
    private final Productionnull_12869 production = new Productionnull_12869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}