package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4236 {
    private final Productionnull_4236 production = new Productionnull_4236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}