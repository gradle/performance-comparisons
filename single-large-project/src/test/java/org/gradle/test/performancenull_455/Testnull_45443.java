package org.gradle.test.performancenull_455;

import static org.junit.Assert.*;

public class Testnull_45443 {
    private final Productionnull_45443 production = new Productionnull_45443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}