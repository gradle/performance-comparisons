package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36267 {
    private final Productionnull_36267 production = new Productionnull_36267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}