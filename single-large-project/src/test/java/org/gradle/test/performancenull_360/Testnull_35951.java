package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35951 {
    private final Productionnull_35951 production = new Productionnull_35951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}