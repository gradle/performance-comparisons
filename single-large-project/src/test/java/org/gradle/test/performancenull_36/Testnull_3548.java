package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3548 {
    private final Productionnull_3548 production = new Productionnull_3548("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}