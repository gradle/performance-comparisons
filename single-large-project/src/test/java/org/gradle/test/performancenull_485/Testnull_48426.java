package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48426 {
    private final Productionnull_48426 production = new Productionnull_48426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}