package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13435 {
    private final Productionnull_13435 production = new Productionnull_13435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}