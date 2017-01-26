package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41102 {
    private final Productionnull_41102 production = new Productionnull_41102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}