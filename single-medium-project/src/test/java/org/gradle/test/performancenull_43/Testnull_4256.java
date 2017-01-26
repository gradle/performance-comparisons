package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4256 {
    private final Productionnull_4256 production = new Productionnull_4256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}