package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41051 {
    private final Productionnull_41051 production = new Productionnull_41051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}