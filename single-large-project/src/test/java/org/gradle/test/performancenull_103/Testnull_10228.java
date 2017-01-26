package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10228 {
    private final Productionnull_10228 production = new Productionnull_10228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}