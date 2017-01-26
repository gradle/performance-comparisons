package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30627 {
    private final Productionnull_30627 production = new Productionnull_30627("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}