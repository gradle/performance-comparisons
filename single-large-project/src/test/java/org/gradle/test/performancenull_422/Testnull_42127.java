package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42127 {
    private final Productionnull_42127 production = new Productionnull_42127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}