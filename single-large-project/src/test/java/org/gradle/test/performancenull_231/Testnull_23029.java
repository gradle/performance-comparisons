package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23029 {
    private final Productionnull_23029 production = new Productionnull_23029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}