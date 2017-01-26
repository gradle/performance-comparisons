package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32435 {
    private final Productionnull_32435 production = new Productionnull_32435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}