package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21547 {
    private final Productionnull_21547 production = new Productionnull_21547("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}