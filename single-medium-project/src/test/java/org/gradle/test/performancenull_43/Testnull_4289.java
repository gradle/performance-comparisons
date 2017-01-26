package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4289 {
    private final Productionnull_4289 production = new Productionnull_4289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}