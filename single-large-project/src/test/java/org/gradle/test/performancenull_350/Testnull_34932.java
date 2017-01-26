package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34932 {
    private final Productionnull_34932 production = new Productionnull_34932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}