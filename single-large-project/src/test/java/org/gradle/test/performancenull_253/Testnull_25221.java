package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25221 {
    private final Productionnull_25221 production = new Productionnull_25221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}