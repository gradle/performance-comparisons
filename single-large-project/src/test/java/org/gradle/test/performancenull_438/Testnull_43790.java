package org.gradle.test.performancenull_438;

import static org.junit.Assert.*;

public class Testnull_43790 {
    private final Productionnull_43790 production = new Productionnull_43790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}