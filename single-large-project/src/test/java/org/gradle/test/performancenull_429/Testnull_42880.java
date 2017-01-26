package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42880 {
    private final Productionnull_42880 production = new Productionnull_42880("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}