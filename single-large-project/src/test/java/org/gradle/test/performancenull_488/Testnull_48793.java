package org.gradle.test.performancenull_488;

import static org.junit.Assert.*;

public class Testnull_48793 {
    private final Productionnull_48793 production = new Productionnull_48793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}