package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4900 {
    private final Productionnull_4900 production = new Productionnull_4900("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}