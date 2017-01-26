package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31078 {
    private final Productionnull_31078 production = new Productionnull_31078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}