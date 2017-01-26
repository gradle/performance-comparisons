package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43147 {
    private final Productionnull_43147 production = new Productionnull_43147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}