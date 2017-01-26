package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17105 {
    private final Productionnull_17105 production = new Productionnull_17105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}