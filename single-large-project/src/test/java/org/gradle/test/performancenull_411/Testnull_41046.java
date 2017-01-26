package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41046 {
    private final Productionnull_41046 production = new Productionnull_41046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}