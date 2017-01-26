package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37091 {
    private final Productionnull_37091 production = new Productionnull_37091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}