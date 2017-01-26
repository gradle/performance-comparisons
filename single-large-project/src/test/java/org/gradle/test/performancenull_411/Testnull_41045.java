package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41045 {
    private final Productionnull_41045 production = new Productionnull_41045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}