package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43187 {
    private final Productionnull_43187 production = new Productionnull_43187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}