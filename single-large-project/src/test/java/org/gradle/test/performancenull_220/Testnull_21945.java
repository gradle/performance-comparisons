package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21945 {
    private final Productionnull_21945 production = new Productionnull_21945("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}