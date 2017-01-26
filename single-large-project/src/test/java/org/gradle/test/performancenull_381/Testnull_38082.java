package org.gradle.test.performancenull_381;

import static org.junit.Assert.*;

public class Testnull_38082 {
    private final Productionnull_38082 production = new Productionnull_38082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}