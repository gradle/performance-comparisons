package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36929 {
    private final Productionnull_36929 production = new Productionnull_36929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}