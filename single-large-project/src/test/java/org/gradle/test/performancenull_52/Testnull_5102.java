package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5102 {
    private final Productionnull_5102 production = new Productionnull_5102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}