package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42089 {
    private final Productionnull_42089 production = new Productionnull_42089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}