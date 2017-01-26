package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32016 {
    private final Productionnull_32016 production = new Productionnull_32016("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}