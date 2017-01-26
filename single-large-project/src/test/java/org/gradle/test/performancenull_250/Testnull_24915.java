package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24915 {
    private final Productionnull_24915 production = new Productionnull_24915("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}