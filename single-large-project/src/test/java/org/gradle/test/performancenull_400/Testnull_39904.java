package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39904 {
    private final Productionnull_39904 production = new Productionnull_39904("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}