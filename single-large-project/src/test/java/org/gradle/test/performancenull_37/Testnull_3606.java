package org.gradle.test.performancenull_37;

import static org.junit.Assert.*;

public class Testnull_3606 {
    private final Productionnull_3606 production = new Productionnull_3606("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}