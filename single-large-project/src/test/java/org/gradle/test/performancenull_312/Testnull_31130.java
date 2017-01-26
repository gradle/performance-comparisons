package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31130 {
    private final Productionnull_31130 production = new Productionnull_31130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}