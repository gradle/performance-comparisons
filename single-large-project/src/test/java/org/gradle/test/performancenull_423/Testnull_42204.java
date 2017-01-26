package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42204 {
    private final Productionnull_42204 production = new Productionnull_42204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}