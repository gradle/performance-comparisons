package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30626 {
    private final Productionnull_30626 production = new Productionnull_30626("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}