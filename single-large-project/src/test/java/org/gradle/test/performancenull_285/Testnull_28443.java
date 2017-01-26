package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28443 {
    private final Productionnull_28443 production = new Productionnull_28443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}