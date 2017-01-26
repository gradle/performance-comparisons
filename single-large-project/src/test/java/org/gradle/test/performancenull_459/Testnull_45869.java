package org.gradle.test.performancenull_459;

import static org.junit.Assert.*;

public class Testnull_45869 {
    private final Productionnull_45869 production = new Productionnull_45869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}