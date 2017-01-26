package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31099 {
    private final Productionnull_31099 production = new Productionnull_31099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}