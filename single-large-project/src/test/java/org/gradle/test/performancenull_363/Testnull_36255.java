package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36255 {
    private final Productionnull_36255 production = new Productionnull_36255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}