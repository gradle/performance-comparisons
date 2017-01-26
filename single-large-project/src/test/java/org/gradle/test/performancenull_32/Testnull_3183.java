package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3183 {
    private final Productionnull_3183 production = new Productionnull_3183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}