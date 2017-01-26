package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1846 {
    private final Productionnull_1846 production = new Productionnull_1846("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}