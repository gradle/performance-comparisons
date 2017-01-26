package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7250 {
    private final Productionnull_7250 production = new Productionnull_7250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}