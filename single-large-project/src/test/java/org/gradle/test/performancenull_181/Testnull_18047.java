package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18047 {
    private final Productionnull_18047 production = new Productionnull_18047("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}