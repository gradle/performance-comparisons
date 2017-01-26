package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22942 {
    private final Productionnull_22942 production = new Productionnull_22942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}