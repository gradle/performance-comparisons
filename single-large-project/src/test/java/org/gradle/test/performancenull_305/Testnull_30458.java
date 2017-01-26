package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30458 {
    private final Productionnull_30458 production = new Productionnull_30458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}