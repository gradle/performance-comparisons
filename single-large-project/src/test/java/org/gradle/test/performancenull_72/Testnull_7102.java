package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7102 {
    private final Productionnull_7102 production = new Productionnull_7102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}