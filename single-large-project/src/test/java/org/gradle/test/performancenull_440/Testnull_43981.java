package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43981 {
    private final Productionnull_43981 production = new Productionnull_43981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}