package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28169 {
    private final Productionnull_28169 production = new Productionnull_28169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}