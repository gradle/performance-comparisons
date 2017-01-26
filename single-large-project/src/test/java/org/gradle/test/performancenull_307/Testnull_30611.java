package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30611 {
    private final Productionnull_30611 production = new Productionnull_30611("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}