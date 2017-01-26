package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37180 {
    private final Productionnull_37180 production = new Productionnull_37180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}