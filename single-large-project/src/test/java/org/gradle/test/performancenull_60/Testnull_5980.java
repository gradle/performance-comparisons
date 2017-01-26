package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5980 {
    private final Productionnull_5980 production = new Productionnull_5980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}