package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12007 {
    private final Productionnull_12007 production = new Productionnull_12007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}