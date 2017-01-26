package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7905 {
    private final Productionnull_7905 production = new Productionnull_7905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}