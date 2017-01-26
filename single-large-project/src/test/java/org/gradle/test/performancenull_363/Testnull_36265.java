package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36265 {
    private final Productionnull_36265 production = new Productionnull_36265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}