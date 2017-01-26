package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3067 {
    private final Productionnull_3067 production = new Productionnull_3067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}