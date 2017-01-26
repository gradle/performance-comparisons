package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36276 {
    private final Productionnull_36276 production = new Productionnull_36276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}