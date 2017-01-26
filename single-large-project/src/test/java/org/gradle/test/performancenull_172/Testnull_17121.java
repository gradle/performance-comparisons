package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17121 {
    private final Productionnull_17121 production = new Productionnull_17121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}