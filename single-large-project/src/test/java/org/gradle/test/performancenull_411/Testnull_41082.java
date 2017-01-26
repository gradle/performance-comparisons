package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41082 {
    private final Productionnull_41082 production = new Productionnull_41082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}