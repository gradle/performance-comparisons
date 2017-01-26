package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30150 {
    private final Productionnull_30150 production = new Productionnull_30150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}