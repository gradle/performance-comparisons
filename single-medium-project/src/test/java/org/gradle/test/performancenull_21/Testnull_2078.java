package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2078 {
    private final Productionnull_2078 production = new Productionnull_2078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}