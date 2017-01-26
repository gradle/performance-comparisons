package org.gradle.test.performancenull_44;

import static org.junit.Assert.*;

public class Testnull_4400 {
    private final Productionnull_4400 production = new Productionnull_4400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}