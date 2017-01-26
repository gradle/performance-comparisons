package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18250 {
    private final Productionnull_18250 production = new Productionnull_18250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}