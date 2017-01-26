package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12476 {
    private final Productionnull_12476 production = new Productionnull_12476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}