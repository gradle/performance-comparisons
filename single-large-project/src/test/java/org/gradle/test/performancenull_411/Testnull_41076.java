package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41076 {
    private final Productionnull_41076 production = new Productionnull_41076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}