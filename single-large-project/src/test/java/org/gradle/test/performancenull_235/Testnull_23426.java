package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23426 {
    private final Productionnull_23426 production = new Productionnull_23426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}