package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3509 {
    private final Productionnull_3509 production = new Productionnull_3509("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}