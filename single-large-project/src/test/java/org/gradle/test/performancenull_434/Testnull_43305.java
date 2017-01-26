package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43305 {
    private final Productionnull_43305 production = new Productionnull_43305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}