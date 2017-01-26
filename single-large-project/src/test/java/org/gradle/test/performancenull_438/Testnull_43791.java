package org.gradle.test.performancenull_438;

import static org.junit.Assert.*;

public class Testnull_43791 {
    private final Productionnull_43791 production = new Productionnull_43791("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}