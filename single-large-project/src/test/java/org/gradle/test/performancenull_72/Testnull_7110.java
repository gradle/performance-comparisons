package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7110 {
    private final Productionnull_7110 production = new Productionnull_7110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}