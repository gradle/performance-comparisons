package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30143 {
    private final Productionnull_30143 production = new Productionnull_30143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}