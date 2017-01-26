package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28491 {
    private final Productionnull_28491 production = new Productionnull_28491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}