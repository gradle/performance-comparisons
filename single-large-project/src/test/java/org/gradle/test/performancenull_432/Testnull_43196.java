package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43196 {
    private final Productionnull_43196 production = new Productionnull_43196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}