package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40238 {
    private final Productionnull_40238 production = new Productionnull_40238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}