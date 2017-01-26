package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11921 {
    private final Productionnull_11921 production = new Productionnull_11921("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}