package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18002 {
    private final Productionnull_18002 production = new Productionnull_18002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}