package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39972 {
    private final Productionnull_39972 production = new Productionnull_39972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}