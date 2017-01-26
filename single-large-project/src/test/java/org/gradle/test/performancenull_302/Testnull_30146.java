package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30146 {
    private final Productionnull_30146 production = new Productionnull_30146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}