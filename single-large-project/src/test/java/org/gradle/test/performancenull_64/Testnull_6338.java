package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6338 {
    private final Productionnull_6338 production = new Productionnull_6338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}