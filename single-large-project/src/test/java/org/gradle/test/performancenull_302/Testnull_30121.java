package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30121 {
    private final Productionnull_30121 production = new Productionnull_30121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}