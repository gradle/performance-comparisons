package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21458 {
    private final Productionnull_21458 production = new Productionnull_21458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}