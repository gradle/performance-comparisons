package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34983 {
    private final Productionnull_34983 production = new Productionnull_34983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}