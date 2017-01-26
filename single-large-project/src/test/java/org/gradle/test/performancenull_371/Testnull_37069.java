package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37069 {
    private final Productionnull_37069 production = new Productionnull_37069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}