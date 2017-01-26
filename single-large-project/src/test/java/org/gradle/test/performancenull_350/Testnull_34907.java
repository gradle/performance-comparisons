package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34907 {
    private final Productionnull_34907 production = new Productionnull_34907("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}