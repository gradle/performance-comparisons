package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29958 {
    private final Productionnull_29958 production = new Productionnull_29958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}