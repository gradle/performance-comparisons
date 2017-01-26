package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34971 {
    private final Productionnull_34971 production = new Productionnull_34971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}