package org.gradle.test.performancenull_119;

import static org.junit.Assert.*;

public class Testnull_11869 {
    private final Productionnull_11869 production = new Productionnull_11869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}