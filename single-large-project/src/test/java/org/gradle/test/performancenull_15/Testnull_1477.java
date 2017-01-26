package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1477 {
    private final Productionnull_1477 production = new Productionnull_1477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}