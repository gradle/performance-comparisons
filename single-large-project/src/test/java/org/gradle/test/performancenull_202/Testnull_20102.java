package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20102 {
    private final Productionnull_20102 production = new Productionnull_20102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}