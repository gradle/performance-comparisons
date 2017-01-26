package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20184 {
    private final Productionnull_20184 production = new Productionnull_20184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}