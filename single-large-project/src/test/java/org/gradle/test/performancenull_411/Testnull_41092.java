package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41092 {
    private final Productionnull_41092 production = new Productionnull_41092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}