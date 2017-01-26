package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43431 {
    private final Productionnull_43431 production = new Productionnull_43431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}