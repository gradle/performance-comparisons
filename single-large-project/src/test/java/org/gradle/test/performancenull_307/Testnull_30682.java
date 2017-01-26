package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30682 {
    private final Productionnull_30682 production = new Productionnull_30682("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}