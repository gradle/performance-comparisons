package org.gradle.test.performancenull_208;

import static org.junit.Assert.*;

public class Testnull_20742 {
    private final Productionnull_20742 production = new Productionnull_20742("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}