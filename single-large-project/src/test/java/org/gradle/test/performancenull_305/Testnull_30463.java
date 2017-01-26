package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30463 {
    private final Productionnull_30463 production = new Productionnull_30463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}