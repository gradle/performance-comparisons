package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21427 {
    private final Productionnull_21427 production = new Productionnull_21427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}