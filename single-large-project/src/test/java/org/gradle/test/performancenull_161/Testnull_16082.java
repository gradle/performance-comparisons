package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16082 {
    private final Productionnull_16082 production = new Productionnull_16082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}