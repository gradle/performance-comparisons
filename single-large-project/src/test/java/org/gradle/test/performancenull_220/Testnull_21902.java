package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21902 {
    private final Productionnull_21902 production = new Productionnull_21902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}