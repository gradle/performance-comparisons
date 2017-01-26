package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7282 {
    private final Productionnull_7282 production = new Productionnull_7282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}