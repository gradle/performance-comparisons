package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41077 {
    private final Productionnull_41077 production = new Productionnull_41077("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}