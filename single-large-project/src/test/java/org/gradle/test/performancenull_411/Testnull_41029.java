package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41029 {
    private final Productionnull_41029 production = new Productionnull_41029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}