package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43985 {
    private final Productionnull_43985 production = new Productionnull_43985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}