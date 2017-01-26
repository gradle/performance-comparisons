package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31082 {
    private final Productionnull_31082 production = new Productionnull_31082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}