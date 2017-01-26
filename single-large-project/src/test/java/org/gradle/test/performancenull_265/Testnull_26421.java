package org.gradle.test.performancenull_265;

import static org.junit.Assert.*;

public class Testnull_26421 {
    private final Productionnull_26421 production = new Productionnull_26421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}