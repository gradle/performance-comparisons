package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1541 {
    private final Productionnull_1541 production = new Productionnull_1541("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}