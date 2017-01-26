package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8086 {
    private final Productionnull_8086 production = new Productionnull_8086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}