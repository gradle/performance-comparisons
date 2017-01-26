package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12924 {
    private final Productionnull_12924 production = new Productionnull_12924("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}