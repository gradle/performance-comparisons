package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34990 {
    private final Productionnull_34990 production = new Productionnull_34990("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}