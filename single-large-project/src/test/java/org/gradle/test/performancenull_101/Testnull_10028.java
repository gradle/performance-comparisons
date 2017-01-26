package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10028 {
    private final Productionnull_10028 production = new Productionnull_10028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}