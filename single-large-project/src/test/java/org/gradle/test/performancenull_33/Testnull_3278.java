package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3278 {
    private final Productionnull_3278 production = new Productionnull_3278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}