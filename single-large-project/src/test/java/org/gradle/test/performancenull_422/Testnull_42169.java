package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42169 {
    private final Productionnull_42169 production = new Productionnull_42169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}