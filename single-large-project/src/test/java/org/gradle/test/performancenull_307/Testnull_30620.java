package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30620 {
    private final Productionnull_30620 production = new Productionnull_30620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}