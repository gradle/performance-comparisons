package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20164 {
    private final Productionnull_20164 production = new Productionnull_20164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}