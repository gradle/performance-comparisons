package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30136 {
    private final Productionnull_30136 production = new Productionnull_30136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}