package org.gradle.test.performancenull_109;

import static org.junit.Assert.*;

public class Testnull_10825 {
    private final Productionnull_10825 production = new Productionnull_10825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}