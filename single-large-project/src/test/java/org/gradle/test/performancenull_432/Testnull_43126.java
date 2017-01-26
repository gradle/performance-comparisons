package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43126 {
    private final Productionnull_43126 production = new Productionnull_43126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}