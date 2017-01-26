package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30102 {
    private final Productionnull_30102 production = new Productionnull_30102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}