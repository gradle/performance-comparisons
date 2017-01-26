package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18869 {
    private final Productionnull_18869 production = new Productionnull_18869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}