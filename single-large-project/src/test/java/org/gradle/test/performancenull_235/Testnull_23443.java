package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23443 {
    private final Productionnull_23443 production = new Productionnull_23443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}