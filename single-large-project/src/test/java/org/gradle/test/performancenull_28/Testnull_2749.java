package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2749 {
    private final Productionnull_2749 production = new Productionnull_2749("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}