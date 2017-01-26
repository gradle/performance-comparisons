package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40268 {
    private final Productionnull_40268 production = new Productionnull_40268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}