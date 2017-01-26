package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25009 {
    private final Productionnull_25009 production = new Productionnull_25009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}