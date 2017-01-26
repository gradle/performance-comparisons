package org.gradle.test.performancenull_460;

import static org.junit.Assert.*;

public class Testnull_45942 {
    private final Productionnull_45942 production = new Productionnull_45942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}