package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41089 {
    private final Productionnull_41089 production = new Productionnull_41089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}