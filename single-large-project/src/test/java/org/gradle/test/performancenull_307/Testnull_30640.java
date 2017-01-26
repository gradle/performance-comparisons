package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30640 {
    private final Productionnull_30640 production = new Productionnull_30640("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}