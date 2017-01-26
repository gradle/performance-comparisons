package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43130 {
    private final Productionnull_43130 production = new Productionnull_43130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}