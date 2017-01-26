package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30483 {
    private final Productionnull_30483 production = new Productionnull_30483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}