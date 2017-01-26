package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19143 {
    private final Productionnull_19143 production = new Productionnull_19143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}