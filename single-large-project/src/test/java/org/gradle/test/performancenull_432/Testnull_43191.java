package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43191 {
    private final Productionnull_43191 production = new Productionnull_43191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}