package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13490 {
    private final Productionnull_13490 production = new Productionnull_13490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}