package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34939 {
    private final Productionnull_34939 production = new Productionnull_34939("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}