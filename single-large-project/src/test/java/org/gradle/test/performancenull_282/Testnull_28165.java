package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28165 {
    private final Productionnull_28165 production = new Productionnull_28165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}