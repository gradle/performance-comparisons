package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21426 {
    private final Productionnull_21426 production = new Productionnull_21426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}