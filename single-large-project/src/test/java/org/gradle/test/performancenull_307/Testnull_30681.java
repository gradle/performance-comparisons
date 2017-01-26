package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30681 {
    private final Productionnull_30681 production = new Productionnull_30681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}