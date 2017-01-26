package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4271 {
    private final Productionnull_4271 production = new Productionnull_4271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}