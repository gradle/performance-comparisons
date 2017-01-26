package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33492 {
    private final Productionnull_33492 production = new Productionnull_33492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}