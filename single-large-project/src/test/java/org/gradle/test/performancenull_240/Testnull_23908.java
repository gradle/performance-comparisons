package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23908 {
    private final Productionnull_23908 production = new Productionnull_23908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}