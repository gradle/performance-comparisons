package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3078 {
    private final Productionnull_3078 production = new Productionnull_3078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}