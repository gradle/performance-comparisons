package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36981 {
    private final Productionnull_36981 production = new Productionnull_36981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}