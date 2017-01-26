package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3176 {
    private final Productionnull_3176 production = new Productionnull_3176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}