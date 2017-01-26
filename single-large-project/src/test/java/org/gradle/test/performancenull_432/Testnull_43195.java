package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43195 {
    private final Productionnull_43195 production = new Productionnull_43195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}