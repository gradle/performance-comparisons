package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10053 {
    private final Productionnull_10053 production = new Productionnull_10053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}