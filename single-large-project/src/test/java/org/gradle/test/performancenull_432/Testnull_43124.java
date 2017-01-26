package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43124 {
    private final Productionnull_43124 production = new Productionnull_43124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}