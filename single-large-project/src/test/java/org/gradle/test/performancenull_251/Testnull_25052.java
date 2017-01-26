package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25052 {
    private final Productionnull_25052 production = new Productionnull_25052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}