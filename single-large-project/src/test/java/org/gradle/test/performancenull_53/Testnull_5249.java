package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5249 {
    private final Productionnull_5249 production = new Productionnull_5249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}