package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30603 {
    private final Productionnull_30603 production = new Productionnull_30603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}