package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43055 {
    private final Productionnull_43055 production = new Productionnull_43055("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}