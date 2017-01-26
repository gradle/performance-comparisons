package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40247 {
    private final Productionnull_40247 production = new Productionnull_40247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}