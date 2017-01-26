package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24281 {
    private final Productionnull_24281 production = new Productionnull_24281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}