package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30652 {
    private final Productionnull_30652 production = new Productionnull_30652("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}