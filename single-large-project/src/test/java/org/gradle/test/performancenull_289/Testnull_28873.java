package org.gradle.test.performancenull_289;

import static org.junit.Assert.*;

public class Testnull_28873 {
    private final Productionnull_28873 production = new Productionnull_28873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}