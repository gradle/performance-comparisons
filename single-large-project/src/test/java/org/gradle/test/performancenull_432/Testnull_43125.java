package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43125 {
    private final Productionnull_43125 production = new Productionnull_43125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}