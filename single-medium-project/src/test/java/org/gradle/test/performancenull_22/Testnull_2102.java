package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2102 {
    private final Productionnull_2102 production = new Productionnull_2102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}