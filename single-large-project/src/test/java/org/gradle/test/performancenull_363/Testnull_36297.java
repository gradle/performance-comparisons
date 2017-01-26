package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36297 {
    private final Productionnull_36297 production = new Productionnull_36297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}