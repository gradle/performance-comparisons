package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40289 {
    private final Productionnull_40289 production = new Productionnull_40289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}