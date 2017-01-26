package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40503 {
    private final Productionnull_40503 production = new Productionnull_40503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}