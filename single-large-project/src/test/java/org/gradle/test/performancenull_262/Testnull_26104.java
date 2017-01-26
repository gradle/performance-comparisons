package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26104 {
    private final Productionnull_26104 production = new Productionnull_26104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}