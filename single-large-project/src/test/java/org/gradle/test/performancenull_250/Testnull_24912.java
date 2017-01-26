package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24912 {
    private final Productionnull_24912 production = new Productionnull_24912("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}