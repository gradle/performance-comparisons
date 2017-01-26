package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_102 {
    private final Productionnull_102 production = new Productionnull_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}