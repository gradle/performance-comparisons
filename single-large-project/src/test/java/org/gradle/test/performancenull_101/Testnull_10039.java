package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10039 {
    private final Productionnull_10039 production = new Productionnull_10039("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}