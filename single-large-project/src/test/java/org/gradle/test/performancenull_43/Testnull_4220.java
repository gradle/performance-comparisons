package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4220 {
    private final Productionnull_4220 production = new Productionnull_4220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}