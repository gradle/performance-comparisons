package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40284 {
    private final Productionnull_40284 production = new Productionnull_40284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}