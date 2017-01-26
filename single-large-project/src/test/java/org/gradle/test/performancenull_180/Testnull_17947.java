package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17947 {
    private final Productionnull_17947 production = new Productionnull_17947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}