package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3701 {
    private final Productionnull_3701 production = new Productionnull_3701("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}