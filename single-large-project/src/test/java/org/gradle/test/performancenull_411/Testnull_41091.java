package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41091 {
    private final Productionnull_41091 production = new Productionnull_41091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}