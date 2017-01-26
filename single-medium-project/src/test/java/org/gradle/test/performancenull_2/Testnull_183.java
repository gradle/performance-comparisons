package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_183 {
    private final Productionnull_183 production = new Productionnull_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}