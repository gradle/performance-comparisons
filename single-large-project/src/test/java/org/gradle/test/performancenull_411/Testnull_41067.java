package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41067 {
    private final Productionnull_41067 production = new Productionnull_41067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}