package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34936 {
    private final Productionnull_34936 production = new Productionnull_34936("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}