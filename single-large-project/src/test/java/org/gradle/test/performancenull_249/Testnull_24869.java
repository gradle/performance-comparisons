package org.gradle.test.performancenull_249;

import static org.junit.Assert.*;

public class Testnull_24869 {
    private final Productionnull_24869 production = new Productionnull_24869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}