package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2183 {
    private final Productionnull_2183 production = new Productionnull_2183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}