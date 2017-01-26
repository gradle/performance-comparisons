package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8480 {
    private final Productionnull_8480 production = new Productionnull_8480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}