package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41042 {
    private final Productionnull_41042 production = new Productionnull_41042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}