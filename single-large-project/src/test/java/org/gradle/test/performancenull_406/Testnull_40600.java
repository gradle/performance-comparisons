package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40600 {
    private final Productionnull_40600 production = new Productionnull_40600("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}