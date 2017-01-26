package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4265 {
    private final Productionnull_4265 production = new Productionnull_4265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}