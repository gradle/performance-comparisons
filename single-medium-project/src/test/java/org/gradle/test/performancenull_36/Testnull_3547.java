package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3547 {
    private final Productionnull_3547 production = new Productionnull_3547("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}