package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42409 {
    private final Productionnull_42409 production = new Productionnull_42409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}