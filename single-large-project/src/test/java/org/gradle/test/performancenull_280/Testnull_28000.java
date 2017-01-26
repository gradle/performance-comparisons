package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_28000 {
    private final Productionnull_28000 production = new Productionnull_28000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}