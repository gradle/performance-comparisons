package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35969 {
    private final Productionnull_35969 production = new Productionnull_35969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}