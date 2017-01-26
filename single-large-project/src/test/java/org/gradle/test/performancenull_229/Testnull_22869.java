package org.gradle.test.performancenull_229;

import static org.junit.Assert.*;

public class Testnull_22869 {
    private final Productionnull_22869 production = new Productionnull_22869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}