package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28134 {
    private final Productionnull_28134 production = new Productionnull_28134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}