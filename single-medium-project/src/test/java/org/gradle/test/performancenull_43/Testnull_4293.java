package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4293 {
    private final Productionnull_4293 production = new Productionnull_4293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}