package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8951 {
    private final Productionnull_8951 production = new Productionnull_8951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}