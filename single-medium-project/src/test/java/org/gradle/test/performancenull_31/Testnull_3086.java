package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3086 {
    private final Productionnull_3086 production = new Productionnull_3086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}