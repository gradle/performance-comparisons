package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9849 {
    private final Productionnull_9849 production = new Productionnull_9849("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}