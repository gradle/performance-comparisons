package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36950 {
    private final Productionnull_36950 production = new Productionnull_36950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}