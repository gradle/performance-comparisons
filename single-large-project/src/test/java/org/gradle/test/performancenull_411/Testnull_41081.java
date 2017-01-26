package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41081 {
    private final Productionnull_41081 production = new Productionnull_41081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}