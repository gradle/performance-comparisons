package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34991 {
    private final Productionnull_34991 production = new Productionnull_34991("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}