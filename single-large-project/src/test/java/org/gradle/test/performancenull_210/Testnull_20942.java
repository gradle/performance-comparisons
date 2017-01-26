package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20942 {
    private final Productionnull_20942 production = new Productionnull_20942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}