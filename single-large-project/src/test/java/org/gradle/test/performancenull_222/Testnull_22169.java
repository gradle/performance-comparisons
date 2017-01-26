package org.gradle.test.performancenull_222;

import static org.junit.Assert.*;

public class Testnull_22169 {
    private final Productionnull_22169 production = new Productionnull_22169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}