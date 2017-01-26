package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29902 {
    private final Productionnull_29902 production = new Productionnull_29902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}