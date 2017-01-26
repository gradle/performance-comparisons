package org.gradle.test.performancenull_109;

import static org.junit.Assert.*;

public class Testnull_10873 {
    private final Productionnull_10873 production = new Productionnull_10873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}