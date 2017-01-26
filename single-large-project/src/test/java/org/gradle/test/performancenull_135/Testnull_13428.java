package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13428 {
    private final Productionnull_13428 production = new Productionnull_13428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}