package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31066 {
    private final Productionnull_31066 production = new Productionnull_31066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}