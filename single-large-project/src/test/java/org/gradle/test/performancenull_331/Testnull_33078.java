package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33078 {
    private final Productionnull_33078 production = new Productionnull_33078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}