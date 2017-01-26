package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30687 {
    private final Productionnull_30687 production = new Productionnull_30687("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}