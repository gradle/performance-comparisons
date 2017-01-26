package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12475 {
    private final Productionnull_12475 production = new Productionnull_12475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}