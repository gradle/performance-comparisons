package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43956 {
    private final Productionnull_43956 production = new Productionnull_43956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}