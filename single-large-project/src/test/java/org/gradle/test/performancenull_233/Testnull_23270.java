package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23270 {
    private final Productionnull_23270 production = new Productionnull_23270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}