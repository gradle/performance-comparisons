package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17135 {
    private final Productionnull_17135 production = new Productionnull_17135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}