package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25748 {
    private final Productionnull_25748 production = new Productionnull_25748("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}