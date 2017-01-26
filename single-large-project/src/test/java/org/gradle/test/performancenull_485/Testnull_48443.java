package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48443 {
    private final Productionnull_48443 production = new Productionnull_48443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}