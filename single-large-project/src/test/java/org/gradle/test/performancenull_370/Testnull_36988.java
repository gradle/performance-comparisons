package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36988 {
    private final Productionnull_36988 production = new Productionnull_36988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}