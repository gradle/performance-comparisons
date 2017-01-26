package org.gradle.test.performancenull_323;

import static org.junit.Assert.*;

public class Testnull_32268 {
    private final Productionnull_32268 production = new Productionnull_32268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}