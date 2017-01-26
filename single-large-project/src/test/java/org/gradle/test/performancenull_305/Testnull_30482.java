package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30482 {
    private final Productionnull_30482 production = new Productionnull_30482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}