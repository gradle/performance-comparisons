package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36943 {
    private final Productionnull_36943 production = new Productionnull_36943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}