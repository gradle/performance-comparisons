package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42011 {
    private final Productionnull_42011 production = new Productionnull_42011("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}