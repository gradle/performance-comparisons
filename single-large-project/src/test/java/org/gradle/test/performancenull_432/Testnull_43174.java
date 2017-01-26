package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43174 {
    private final Productionnull_43174 production = new Productionnull_43174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}