package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25297 {
    private final Productionnull_25297 production = new Productionnull_25297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}