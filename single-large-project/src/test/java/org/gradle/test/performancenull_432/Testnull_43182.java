package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43182 {
    private final Productionnull_43182 production = new Productionnull_43182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}