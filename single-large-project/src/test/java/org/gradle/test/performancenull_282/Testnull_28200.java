package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28200 {
    private final Productionnull_28200 production = new Productionnull_28200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}