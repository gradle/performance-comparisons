package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36902 {
    private final Productionnull_36902 production = new Productionnull_36902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}