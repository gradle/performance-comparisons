package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3055 {
    private final Productionnull_3055 production = new Productionnull_3055("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}