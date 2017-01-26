package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23039 {
    private final Productionnull_23039 production = new Productionnull_23039("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}