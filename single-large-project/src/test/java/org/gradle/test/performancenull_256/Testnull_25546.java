package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25546 {
    private final Productionnull_25546 production = new Productionnull_25546("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}