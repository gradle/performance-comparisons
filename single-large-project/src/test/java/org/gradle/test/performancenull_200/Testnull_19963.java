package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19963 {
    private final Productionnull_19963 production = new Productionnull_19963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}