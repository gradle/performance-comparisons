package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4215 {
    private final Productionnull_4215 production = new Productionnull_4215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}