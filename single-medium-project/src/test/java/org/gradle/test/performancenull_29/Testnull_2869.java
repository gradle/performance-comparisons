package org.gradle.test.performancenull_29;

import static org.junit.Assert.*;

public class Testnull_2869 {
    private final Productionnull_2869 production = new Productionnull_2869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}