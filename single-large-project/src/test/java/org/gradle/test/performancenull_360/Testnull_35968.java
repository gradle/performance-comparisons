package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35968 {
    private final Productionnull_35968 production = new Productionnull_35968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}