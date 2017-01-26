package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41065 {
    private final Productionnull_41065 production = new Productionnull_41065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}