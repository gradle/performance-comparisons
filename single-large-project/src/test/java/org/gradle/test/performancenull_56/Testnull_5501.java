package org.gradle.test.performancenull_56;

import static org.junit.Assert.*;

public class Testnull_5501 {
    private final Productionnull_5501 production = new Productionnull_5501("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}