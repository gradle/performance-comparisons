package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43143 {
    private final Productionnull_43143 production = new Productionnull_43143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}