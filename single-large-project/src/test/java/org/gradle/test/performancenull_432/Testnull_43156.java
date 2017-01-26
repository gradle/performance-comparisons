package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43156 {
    private final Productionnull_43156 production = new Productionnull_43156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}