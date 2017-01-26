package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3926 {
    private final Productionnull_3926 production = new Productionnull_3926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}