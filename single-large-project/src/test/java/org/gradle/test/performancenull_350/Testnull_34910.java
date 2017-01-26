package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34910 {
    private final Productionnull_34910 production = new Productionnull_34910("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}