package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33958 {
    private final Productionnull_33958 production = new Productionnull_33958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}