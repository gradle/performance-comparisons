package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12415 {
    private final Productionnull_12415 production = new Productionnull_12415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}