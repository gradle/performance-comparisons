package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23869 {
    private final Productionnull_23869 production = new Productionnull_23869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}