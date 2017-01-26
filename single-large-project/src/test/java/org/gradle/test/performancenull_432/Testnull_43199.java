package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43199 {
    private final Productionnull_43199 production = new Productionnull_43199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}