package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12472 {
    private final Productionnull_12472 production = new Productionnull_12472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}