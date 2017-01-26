package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42488 {
    private final Productionnull_42488 production = new Productionnull_42488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}