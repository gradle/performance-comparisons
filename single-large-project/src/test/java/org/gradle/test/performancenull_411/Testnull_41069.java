package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41069 {
    private final Productionnull_41069 production = new Productionnull_41069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}