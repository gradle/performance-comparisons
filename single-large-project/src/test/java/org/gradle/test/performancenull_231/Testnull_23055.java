package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23055 {
    private final Productionnull_23055 production = new Productionnull_23055("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}