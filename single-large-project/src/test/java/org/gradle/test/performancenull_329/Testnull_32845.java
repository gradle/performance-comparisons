package org.gradle.test.performancenull_329;

import static org.junit.Assert.*;

public class Testnull_32845 {
    private final Productionnull_32845 production = new Productionnull_32845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}