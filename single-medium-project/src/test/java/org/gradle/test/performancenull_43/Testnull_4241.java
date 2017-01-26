package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4241 {
    private final Productionnull_4241 production = new Productionnull_4241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}