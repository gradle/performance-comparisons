package org.gradle.test.performancenull_149;

import static org.junit.Assert.*;

public class Testnull_14869 {
    private final Productionnull_14869 production = new Productionnull_14869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}