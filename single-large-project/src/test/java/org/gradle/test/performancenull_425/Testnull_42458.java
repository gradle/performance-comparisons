package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42458 {
    private final Productionnull_42458 production = new Productionnull_42458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}