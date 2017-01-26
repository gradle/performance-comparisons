package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30694 {
    private final Productionnull_30694 production = new Productionnull_30694("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}