package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23028 {
    private final Productionnull_23028 production = new Productionnull_23028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}