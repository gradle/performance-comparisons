package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25086 {
    private final Productionnull_25086 production = new Productionnull_25086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}