package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37254 {
    private final Productionnull_37254 production = new Productionnull_37254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}