package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41002 {
    private final Productionnull_41002 production = new Productionnull_41002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}