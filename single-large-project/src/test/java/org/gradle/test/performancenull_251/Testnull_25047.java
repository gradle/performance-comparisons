package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25047 {
    private final Productionnull_25047 production = new Productionnull_25047("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}