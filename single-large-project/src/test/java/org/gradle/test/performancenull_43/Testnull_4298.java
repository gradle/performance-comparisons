package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4298 {
    private final Productionnull_4298 production = new Productionnull_4298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}