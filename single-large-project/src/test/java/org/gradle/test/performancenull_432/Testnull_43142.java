package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43142 {
    private final Productionnull_43142 production = new Productionnull_43142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}