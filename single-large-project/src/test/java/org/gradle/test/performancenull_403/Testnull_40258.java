package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40258 {
    private final Productionnull_40258 production = new Productionnull_40258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}