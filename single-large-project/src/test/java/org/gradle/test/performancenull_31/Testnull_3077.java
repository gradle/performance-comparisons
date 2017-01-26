package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3077 {
    private final Productionnull_3077 production = new Productionnull_3077("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}