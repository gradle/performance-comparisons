package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32085 {
    private final Productionnull_32085 production = new Productionnull_32085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}