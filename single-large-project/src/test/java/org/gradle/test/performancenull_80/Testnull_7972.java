package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7972 {
    private final Productionnull_7972 production = new Productionnull_7972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}