package org.gradle.test.performancenull_438;

import static org.junit.Assert.*;

public class Testnull_43785 {
    private final Productionnull_43785 production = new Productionnull_43785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}