package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3957 {
    private final Productionnull_3957 production = new Productionnull_3957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}