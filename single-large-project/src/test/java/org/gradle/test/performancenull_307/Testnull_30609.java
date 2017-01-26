package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30609 {
    private final Productionnull_30609 production = new Productionnull_30609("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}