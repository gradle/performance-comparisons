package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6390 {
    private final Productionnull_6390 production = new Productionnull_6390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}