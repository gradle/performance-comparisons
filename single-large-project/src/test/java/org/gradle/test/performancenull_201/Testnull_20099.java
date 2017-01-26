package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20099 {
    private final Productionnull_20099 production = new Productionnull_20099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}