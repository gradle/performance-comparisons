package org.gradle.test.performancenull_109;

import static org.junit.Assert.*;

public class Testnull_10869 {
    private final Productionnull_10869 production = new Productionnull_10869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}