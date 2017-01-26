package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19109 {
    private final Productionnull_19109 production = new Productionnull_19109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}