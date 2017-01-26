package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1869 {
    private final Productionnull_1869 production = new Productionnull_1869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}