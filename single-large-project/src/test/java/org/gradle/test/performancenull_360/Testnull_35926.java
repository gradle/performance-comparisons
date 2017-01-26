package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35926 {
    private final Productionnull_35926 production = new Productionnull_35926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}