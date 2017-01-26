package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41782 {
    private final Productionnull_41782 production = new Productionnull_41782("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}