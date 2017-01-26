package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1730 {
    private final Productionnull_1730 production = new Productionnull_1730("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}