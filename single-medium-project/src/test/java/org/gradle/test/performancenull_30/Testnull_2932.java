package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2932 {
    private final Productionnull_2932 production = new Productionnull_2932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}