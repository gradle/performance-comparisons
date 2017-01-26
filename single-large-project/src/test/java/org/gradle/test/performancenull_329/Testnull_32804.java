package org.gradle.test.performancenull_329;

import static org.junit.Assert.*;

public class Testnull_32804 {
    private final Productionnull_32804 production = new Productionnull_32804("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}